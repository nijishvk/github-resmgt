DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `loadHexaResData`()
begin

	DECLARE done INT DEFAULT FALSE;
    
    DECLARE V_CURNT_STAT INT(10);
	DECLARE V_FirstName varchar(100);
	DECLARE V_LastName varchar(100);    
	DECLARE V_RES_TYP INT;
	DECLARE V_BIL_TYP INT;
	DECLARE V_BDGT_TYP INT;
	DECLARE V_BIL_ROLE INT;
	DECLARE V_RATE DECIMAL(10,2);
	DECLARE V_PS_ID varchar(20);
	DECLARE V_GNDR char(1);
	DECLARE V_PRENT_LOCTN INT;
	DECLARE V_SIT_LOCTN INT;
	DECLARE V_SKILLSET varchar(500);
	DECLARE V_SOW_WHT_CARD varchar(100);
	DECLARE V_MBL_NO varchar(100);
	DECLARE V_BBH_EML varchar(100);
	DECLARE V_HEX_EXP DECIMAL(3,2);
	DECLARE V_OUT_EXP DECIMAL(3,2);
	DECLARE V_TOT_EXP DECIMAL(3,2);
	DECLARE V_HEX_PRJ_MNGR varchar(100);
	DECLARE V_DELR_LEDR varchar(100);    
    DECLARE V_BBH_STR_DATE DATE;
    DECLARE V_BBH_END_DATE DATE;
    
    DECLARE V_BBH_SECT INT;
    DECLARE V_BBH_DEPT INT;
    DECLARE V_BBH_APP_MNGR varchar(150); 
    DECLARE V_BBH_DIV_MNGR varchar(150); 
    
	DECLARE V_RES_ACCT_LAN_ID varchar(50);
    DECLARE V_RES_ACCT_NEW_VM_ID varchar(50);
    DECLARE V_RES_KEY_FOB_ID varchar(50);
    DECLARE V_RES_KEY_FOB_EXPRY_DT DATE;
    DECLARE V_RES_PLLR_HD varchar(50);
    DECLARE V_RES_LAN_EXPRY DATE;
    DECLARE V_RES_EXHIBIT char(1);
    DECLARE V_RES_SDLC char(1);    
    DECLARE V_RES_GROUP INT;
    DECLARE V_RES_EXCTNG_UNT INT;    
    DECLARE V_RES_BGV char(1);
	DECLARE V_RES_BBH_EXP decimal(3,2);
    DECLARE V_PRJ_ID INT;   
    DECLARE V_R_ROLE INT; 
    DECLARE V_HEX_Emp_ID varchar(100);
    DECLARE V_GRADES INT;
    DECLARE V_LEAD_CONSLT INT;
    DECLARE V_RES_UNIT INT;
    
	DECLARE cur cursor for select 
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'CURNT_STAT' and d.GEN_NME = CURNT_STAT) as CURNT_STAT,
	SUBSTRING_INDEX(RES_NME, ',', -1)  as FirstName,
	SUBSTRING_INDEX(RES_NME, ',', 1)  as LastName,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'RES_TYPE' and d.GEN_NME = RES_TYP) as RES_TYP,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'BIL_TYPE' and d.GEN_NME = BIL_TYP) as BIL_TYP,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'BDGT_TYPE' and d.GEN_NME = BDGT_TYP) as BDGT_TYP,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'BIL_ROLE' and d.GEN_NME = BIL_ROLE) as BIL_ROLE,
	CAST(RATE as DECIMAL(10,2)) as RATE,
	PS_ID,
	GNDR,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'PRENT_LOCTN' and d.GEN_NME = PRENT_LOCTN) as PRENT_LOCTN,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'SIT_LOCTN' and d.GEN_NME = SIT_LOCTN) as SIT_LOCTN,
	SKILLSET,
	SOW_WHT_CARD,
	MBL_NO,
	BBH_EML,
	CAST(HEX_EXP as DECIMAL(3,2)) as HEX_EXP,
	CAST(OUT_EXP as DECIMAL(3,2)) as OUT_EXP,
	CAST(TOT_EXP as DECIMAL(3,2)) as TOT_EXP,
	HEX_PRJ_MNGR,
	DELR_LEDR,
    str_to_date(BBH_STR_DATE,'%m/%d/%Y') as BBH_STR_DATE,
	str_to_date(BBH_END_DATE,'%m/%d/%Y') as BBH_END_DATE,
    
    (select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'BBH_SEC' and d.GEN_NME = BBH_SECT) as BBH_SECT,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'BBH_DEPT' and d.GEN_NME = (select BBH_DEPT from bbh_data_pull bdp where bdp.RES_NME = hdp.RES_NME)) as BBH_DEPT,
	(select BBH_APP_MNGR  from bbh_data_pull bdp where bdp.RES_NME = hdp.RES_NME) as BBH_APP_MNGR,
	(select BBH_DIV_MNGR  from bbh_data_pull bdp where bdp.RES_NME = hdp.RES_NME) as BBH_DIV_MNGR,
    
    LAN_ID,
	VM_ID,
	KEY_FOB_ID,
	str_to_date(KEY_FOB_EXP_DATE,'%m/%d/%Y') as KEY_FOB_EXP_DATE,
    (select PILR_HEAD from bbh_data_pull bdp where bdp.RES_NME = hdp.RES_NME)  as PILR_HEAD ,
    str_to_date(LAN_ID_EXP,'%m/%d/%Y') as LAN_ID_EXP,
	CASE EXBT3_CMPLTD when 'Yes' then 'Y' when 'No' then 'N' END as EXBT3_CMPLTD,
	CASE SDLC_CMPLTD when 'Yes' then 'Y' when 'No' then 'N' END as SDLC_CMPLTD,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'GRP_NME' and d.GEN_NME = GRP_NME) as GRP_NME,
	(select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'EXC_UNIT' and d.GEN_NME = EXC_UNIT) as EXC_UNIT,
	CASE BGV_STAT when 'Yes' then 'Y' when 'No' then 'N' END as BGV_STAT,
	CAST(BBH_EXP as DECIMAL(3,2)) as BBH_EXP,
    
    (select d.PRJ_ID from T007_POJECT_MASTER d where d.PRJ_NME = hdp.PRJ_NME) as PRJ_NME,
    (select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'REC_ROLE' and d.GEN_NME = ROLE) as R_ROLE,
    HEX_Emp_ID,
    
    (select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'GRADE' and d.GEN_NME = GRADES) as GRADES,
    (select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'LEAD_CONSLT' and d.GEN_NME = LEAD_CONSLT) as LEAD_CONSLT,
    (select d.GEN_ID from t006_general_data d where d.GEN_TYP = 'RES_UNIT' and d.GEN_NME = RES_UNIT) as RES_UNIT
           
	from hex_data_pull hdp;
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    DECLARE exit handler for sqlexception
		BEGIN
			GET DIAGNOSTICS CONDITION 1
			@p1 = RETURNED_SQLSTATE, @p2 = MESSAGE_TEXT;
			SELECT @p1 as RETURNED_SQLSTATE  , @p2 as MESSAGE_TEXT;
		ROLLBACK;
	END;
       
    START TRANSACTION;
    
    open cur;
		
        read_loop: LOOP
			
            FETCH cur INTO V_CURNT_STAT,V_FirstName,V_LastName,V_RES_TYP,V_BIL_TYP,V_BDGT_TYP,V_BIL_ROLE,V_RATE,V_PS_ID,V_GNDR,V_PRENT_LOCTN,V_SIT_LOCTN,V_SKILLSET,V_SOW_WHT_CARD,V_MBL_NO
			,V_BBH_EML,V_HEX_EXP,V_OUT_EXP,V_TOT_EXP,V_HEX_PRJ_MNGR,V_DELR_LEDR,V_BBH_STR_DATE,V_BBH_END_DATE,
            V_BBH_SECT,V_BBH_DEPT,V_BBH_APP_MNGR,V_BBH_DIV_MNGR,
            V_RES_ACCT_LAN_ID,V_RES_ACCT_NEW_VM_ID,V_RES_KEY_FOB_ID,V_RES_KEY_FOB_EXPRY_DT,V_RES_PLLR_HD,V_RES_LAN_EXPRY,
			V_RES_EXHIBIT,V_RES_SDLC,V_RES_GROUP,V_RES_EXCTNG_UNT,V_RES_BGV,V_RES_BBH_EXP,V_PRJ_ID,V_R_ROLE,V_HEX_Emp_ID,V_GRADES,V_LEAD_CONSLT,V_RES_UNIT;
            
            IF done THEN
				LEAVE read_loop;
			END IF;
            
            insert into t004_resource_master(
				RES_STAT, 
				RES_USR_NME, 
				RES_USR_PWD,
				RES_FIRST_NME,
				RES_LAST_NME,
				RES_TYP,
				RES_BILL_TYP,
				RES_BDGT_TYP,
				RES_BILL_ROLE,
				RES_RATE,
				T001_ACCT_ID,
				RES_PSID,
				RES_GNDR,
				RES_LOC,
				RES_STE_LOC,
				RES_SKILL_SET,
				RES_ROLE,
				RES_SOW,
				RES_HEX_POC,
				RES_OFF_NO,
				RES_MOBL_NO,
				RES_HEX_EMP_ID,
				RES_HEX_EXP,
				RES_OUTSD_EXP,
				RES_TOT_EXP,
				RES_HEX_MGR,
				RES_DEV_LDR,
				T002_ROLE_ID,
				RES_JOIN_DT,
				RES_END_DT,
                RES_GRD,
				RES_LED_CON,
				RES_UNIT,
				CRTD_TSP,
				UPDT_TSP,
				CRTD_USR,
				UPDT_USR
                
               
		) values(
				V_CURNT_STAT,
				NULL,
				NULL,
				V_FirstName,
				V_LastName,
				V_RES_TYP,
				V_BIL_TYP,
				V_BDGT_TYP,
				V_BIL_ROLE,
				V_RATE,
				1,
				V_PS_ID,
				V_GNDR,
				V_PRENT_LOCTN,
				V_SIT_LOCTN,
				V_SKILLSET,
				V_R_ROLE,
				V_SOW_WHT_CARD,
				NULL,
				V_MBL_NO,
				V_MBL_NO,
				V_HEX_Emp_ID,
				V_HEX_EXP,
				V_OUT_EXP,
				V_TOT_EXP,
				V_HEX_PRJ_MNGR,
				V_DELR_LEDR,
				1,
				V_BBH_STR_DATE,
				V_BBH_END_DATE,
                V_GRADES,
				V_LEAD_CONSLT,
				V_RES_UNIT,
				now(),
				now(),
				'27571',
				'27571'
                
                
				
		);
        
        
        insert into t005_res_account_dtl
		(
			T004_RESID,
			ACCT_SCTN,
			ACCT_DEPT, 
            RES_ACCT_PRJT_ID,
			RES_ACCT_LAN_ID,
			RES_ACCT_NEW_VM_ID,
			RES_KEY_FOB_ID,
			RES_KEY_FOB_EXPRY_DT,            
			RES_ACCT_MGR,
			RES_DIV_MGR,            
			RES_PLLR_HD,            
			RES_ACCT_EMAIL,            
			RES_LAN_EXPRY,
			RES_EXHIBIT,
			RES_SDLC,
			RES_GROUP,
			RES_EXCTNG_UNT,
			RES_ACCT_STRT_DT,
			RES_ACCT_END_DT,
			RES_BGV,
			RES_BBH_EXP,
            RES_ACCT_STAT,
            CRTD_TSP,
			UPDT_TSP,
			CRTD_USR,
			UPDT_USR


		)
		values
		(
			(select rm.RES_ID from t004_resource_master rm where rm.RES_FIRST_NME = V_FirstName and rm.RES_LAST_NME = V_LastName),
			V_BBH_SECT,
			V_BBH_DEPT,
            V_PRJ_ID,
			V_RES_ACCT_LAN_ID,
			V_RES_ACCT_NEW_VM_ID,
			V_RES_KEY_FOB_ID,
			V_RES_KEY_FOB_EXPRY_DT,
			V_BBH_APP_MNGR,
			V_BBH_DIV_MNGR,
			V_RES_PLLR_HD,
			V_BBH_EML,
			V_RES_LAN_EXPRY,
			V_RES_EXHIBIT,
			V_RES_SDLC,
			V_RES_GROUP,
			V_RES_EXCTNG_UNT,
			V_BBH_STR_DATE,
			V_BBH_END_DATE,
			V_RES_BGV,
			V_RES_BBH_EXP,
            V_CURNT_STAT,
            now(),
            now(),
            '27571',
            '27571'

		);
        
        
		END LOOP;
        
	close cur;
    
    UPDATE t004_resource_master SET RES_USR_NME = CONCAT(RES_FIRST_NME,RES_ID) , 
	RES_USR_PWD  = CONCAT(RES_FIRST_NME,RES_ID);

	COMMIT;

end$$
DELIMITER ;
