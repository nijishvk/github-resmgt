package com.hexa.resmgt.springboot.repositories;

import org.springframework.stereotype.Repository;

import com.hexa.resmgt.springboot.model.ChartData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ChartDataRepository extends JpaRepository <ChartData,Long>{
	
	
	@Query("select c from ChartData c where c.chartType = :chartType")
    public List<ChartData> findByChartType(@Param("chartType") String chartType);
	

}
