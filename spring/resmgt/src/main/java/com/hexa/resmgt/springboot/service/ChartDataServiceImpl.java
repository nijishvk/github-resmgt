package com.hexa.resmgt.springboot.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.resmgt.springboot.model.ChartData;
import com.hexa.resmgt.springboot.repositories.ChartDataRepository;

@Service("chartDataService")
@Transactional
public class ChartDataServiceImpl implements ChartDataService {

	@Autowired
	ChartDataRepository chartDataRepository;
	
	
	@Override
	public List<ChartData> getChartDataByType(String chartType) {
		// TODO Auto-generated method stub
		return chartDataRepository.findByChartType(chartType);
	}

}
