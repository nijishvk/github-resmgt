package com.hexa.resmgt.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.resmgt.springboot.model.HexaDataPull;
import com.hexa.resmgt.springboot.repositories.HexaDataPullRepository;

@Service("hexaDataPullService")
@Transactional
public class HexaDataPullServiceImpl implements HexaDataPullService{
	
	@Autowired
	private HexaDataPullRepository hexaDataPullRepository;

	@Override
	public HexaDataPull findById(Long id) {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findOne(id);
	}

	@Override
	public HexaDataPull findByName(String name) {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findByResName(name);
	}

	@Override
	public void saveUser(HexaDataPull user) {
		hexaDataPullRepository.save(user);
	}

	@Override
	public void updateUser(HexaDataPull user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		hexaDataPullRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		hexaDataPullRepository.deleteAll();
	}

	@Override
	public List<HexaDataPull> findAllUsers() {
		// TODO Auto-generated method stub
		return hexaDataPullRepository.findAll();
	}

	@Override
	public boolean isUserExist(HexaDataPull user) {
		return findByName(user.getResName()) != null;
	}

}
