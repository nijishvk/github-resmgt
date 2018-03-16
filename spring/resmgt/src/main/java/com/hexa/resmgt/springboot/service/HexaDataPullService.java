package com.hexa.resmgt.springboot.service;

import com.hexa.resmgt.springboot.model.HexaDataPull;
import java.util.List;

public interface HexaDataPullService {

	HexaDataPull findById(Long id);

	HexaDataPull findByName(String name);

	void saveUser(HexaDataPull user);

	void updateUser(HexaDataPull user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<HexaDataPull> findAllUsers();

	boolean isUserExist(HexaDataPull user);
}
