package com.hexa.resmgt.springboot.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HEX_DATA_PULL")
public class HexaDataPull implements Serializable{
	 
	private static final long serialVersionUID = -2495821229195602620L;

		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;  
	    
	
	 	@Column(name="FST_LST_NME")
	    private String firstName;
	 
	    @Column(name="RES_NME")
	    private String resName;
	 
	    @Column(name="CURNT_STAT")
	    private String status;
	    
	    @Column(name="RES_TYP")
	    private String resType;
	    
	    @Column(name="BIL_TYP")
	    private String bilType;
	    
	    @Column(name="BDGT_TYP")
	    private String bdgtType;   
	    
	    @Column(name="BIL_ROLE")
	    private String bilRole;
	    
	    @Column(name="RATE")
	    private String rate;
	    
	    @Column(name="GNDR")
	    private String gender;
	    
	    @Column(name="LEAD_CONSLT")
	    private String lead;
	    
	    @Column(name="PS_ID")
	    private String psid;
	    
	    @Column(name="BBH_SECT")
	    private String bbhSection;
	    
	    @Column(name="PRJ_NME")
	    private String projectName;
	    
	    @Column(name="PRENT_LOCTN")
	    private String presentLoc;
	    
	    @Column(name="SIT_LOCTN")
	    private String sitLoc;
	    
	    @Column(name="SKILLSET")
	    private String skillset;
	    
	    @Column(name="ROLE")
	    private String role;
	    
	    @Column(name="SOW_WHT_CARD")
	    private String sowNumber;
	    
	    @Column(name="TOT_EXP")
	    private String totalExperince;
	    
	    @Column(name="LAN_ID")
	    private String lanId;
	    
	    @Column(name="LAN_ID_EXP")
	    private String lanIdExp;
	    
	    @Column(name="VM_ID")
	    private String vmId;
	    
	    @Column(name="KEY_FOB_ID")
	    private String keyFobId;
	    
	    @Column(name="KEY_FOB_EXP_DATE")
	    private String keyFobExpDt;
	    
	    @Column(name="EXBT3_CMPLTD")
	    private String exbt3;
	    
	    @Column(name="SDLC_CMPLTD")
	    private String sdlc;
	    
	    @Column(name="HEX_EMP_ID")
	    private String hexEmpId;
	    
	    @Column(name="GRADES")
	    private String grades;
	    
	    @Column(name="BBH_MNGR")
	    private String bbhManger;
	    
	    @Column(name="DIV_HEAD")
	    private String divHead;
	    
	    @Column(name="GRP_NME")
	    private String groupName;
	    
	    @Column(name="EXC_UNIT")
	    private String excUnit;
	    
	    @Column(name="RES_UNIT")
	    private String resUnit;
	    
	    @Column(name="BBH_STR_DATE")
	    private String bbhStartdate;
	    
	    @Column(name="MBL_NO")
	    private String mobileNumber;
	    
	    @Column(name="BBH_EML")
	    private String bbhEmail;
	    
	    @Column(name="HEX_PRJ_MNGR")
	    private String hexProjectManager;
	    
	    @Column(name="BGV_STAT")
	    private String bgvStatus;
	    
	    @Column(name="DELR_LEDR")
	    private String deliveryLeader;
	    
	    @Column(name="SOME_DTE")
	    private String someDate;
	    
	    @Column(name="BBH_EXP")
	    private String bbhExperince;
	    
	    @Column(name="HEX_EXP")
	    private String hexaExperince;
	    
	    @Column(name="OUT_EXP")
	    private String outsideExperince;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getResName() {
			return resName;
		}

		public void setResName(String resName) {
			this.resName = resName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResType() {
			return resType;
		}

		public void setResType(String resType) {
			this.resType = resType;
		}

		public String getBilType() {
			return bilType;
		}

		public void setBilType(String bilType) {
			this.bilType = bilType;
		}

		public String getBdgtType() {
			return bdgtType;
		}

		public void setBdgtType(String bdgtType) {
			this.bdgtType = bdgtType;
		}

		public String getBilRole() {
			return bilRole;
		}

		public void setBilRole(String bilRole) {
			this.bilRole = bilRole;
		}

		public String getRate() {
			return rate;
		}

		public void setRate(String rate) {
			this.rate = rate;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getLead() {
			return lead;
		}

		public void setLead(String lead) {
			this.lead = lead;
		}

		public String getPsid() {
			return psid;
		}

		public void setPsid(String psid) {
			this.psid = psid;
		}

		public String getBbhSection() {
			return bbhSection;
		}

		public void setBbhSection(String bbhSection) {
			this.bbhSection = bbhSection;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getPresentLoc() {
			return presentLoc;
		}

		public void setPresentLoc(String presentLoc) {
			this.presentLoc = presentLoc;
		}

		public String getSitLoc() {
			return sitLoc;
		}

		public void setSitLoc(String sitLoc) {
			this.sitLoc = sitLoc;
		}

		public String getSkillset() {
			return skillset;
		}

		public void setSkillset(String skillset) {
			this.skillset = skillset;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getSowNumber() {
			return sowNumber;
		}

		public void setSowNumber(String sowNumber) {
			this.sowNumber = sowNumber;
		}

		public String getTotalExperince() {
			return totalExperince;
		}

		public void setTotalExperince(String totalExperince) {
			this.totalExperince = totalExperince;
		}

		public String getLanId() {
			return lanId;
		}

		public void setLanId(String lanId) {
			this.lanId = lanId;
		}

		public String getLanIdExp() {
			return lanIdExp;
		}

		public void setLanIdExp(String lanIdExp) {
			this.lanIdExp = lanIdExp;
		}

		public String getVmId() {
			return vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public String getKeyFobId() {
			return keyFobId;
		}

		public void setKeyFobId(String keyFobId) {
			this.keyFobId = keyFobId;
		}

		public String getKeyFobExpDt() {
			return keyFobExpDt;
		}

		public void setKeyFobExpDt(String keyFobExpDt) {
			this.keyFobExpDt = keyFobExpDt;
		}

		public String getExbt3() {
			return exbt3;
		}

		public void setExbt3(String exbt3) {
			this.exbt3 = exbt3;
		}

		public String getSdlc() {
			return sdlc;
		}

		public void setSdlc(String sdlc) {
			this.sdlc = sdlc;
		}

		public String getHexEmpId() {
			return hexEmpId;
		}

		public void setHexEmpId(String hexEmpId) {
			this.hexEmpId = hexEmpId;
		}

		public String getGrades() {
			return grades;
		}

		public void setGrades(String grades) {
			this.grades = grades;
		}

		public String getBbhManger() {
			return bbhManger;
		}

		public void setBbhManger(String bbhManger) {
			this.bbhManger = bbhManger;
		}

		public String getDivHead() {
			return divHead;
		}

		public void setDivHead(String divHead) {
			this.divHead = divHead;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getExcUnit() {
			return excUnit;
		}

		public void setExcUnit(String excUnit) {
			this.excUnit = excUnit;
		}

		public String getResUnit() {
			return resUnit;
		}

		public void setResUnit(String resUnit) {
			this.resUnit = resUnit;
		}

		public String getBbhStartdate() {
			return bbhStartdate;
		}

		public void setBbhStartdate(String bbhStartdate) {
			this.bbhStartdate = bbhStartdate;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getBbhEmail() {
			return bbhEmail;
		}

		public void setBbhEmail(String bbhEmail) {
			this.bbhEmail = bbhEmail;
		}

		public String getHexProjectManager() {
			return hexProjectManager;
		}

		public void setHexProjectManager(String hexProjectManager) {
			this.hexProjectManager = hexProjectManager;
		}

		public String getBgvStatus() {
			return bgvStatus;
		}

		public void setBgvStatus(String bgvStatus) {
			this.bgvStatus = bgvStatus;
		}

		public String getDeliveryLeader() {
			return deliveryLeader;
		}

		public void setDeliveryLeader(String deliveryLeader) {
			this.deliveryLeader = deliveryLeader;
		}

		public String getSomeDate() {
			return someDate;
		}

		public void setSomeDate(String someDate) {
			this.someDate = someDate;
		}

		public String getBbhExperince() {
			return bbhExperince;
		}

		public void setBbhExperince(String bbhExperince) {
			this.bbhExperince = bbhExperince;
		}

		public String getHexaExperince() {
			return hexaExperince;
		}

		public void setHexaExperince(String hexaExperince) {
			this.hexaExperince = hexaExperince;
		}

		public String getOutsideExperince() {
			return outsideExperince;
		}

		public void setOutsideExperince(String outsideExperince) {
			this.outsideExperince = outsideExperince;
		}

}
