package com.hexa.resmgt.springboot.repositories;

import com.hexa.resmgt.springboot.model.HexaDataPull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HexaDataPullRepository extends JpaRepository<HexaDataPull, Long> {
	HexaDataPull findByResName(String resName);
	
}
