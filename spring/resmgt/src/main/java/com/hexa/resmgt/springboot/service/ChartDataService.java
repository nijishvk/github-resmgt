package com.hexa.resmgt.springboot.service;

import java.util.List;

import com.hexa.resmgt.springboot.model.ChartData;

public interface ChartDataService {
	
	List<ChartData> getChartDataByType(String type);

}
