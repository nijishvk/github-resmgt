package com.hexa.resmgt.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t008_chart_data")
public class ChartData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2380428494507380773L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="T008_ID")
	private long id;
	
	@Column(name="X_AXIS_DATA")
	private String xAxisDate;
	
	@Column(name="Y_AXIS_DATA")
	private String yAxisDate;
	
	@Column(name="DATA_ORDER")
	private String dataOrder;
	
	@Column(name="CHART_TYPE")
	private String chartType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getxAxisDate() {
		return xAxisDate;
	}

	public void setxAxisDate(String xAxisDate) {
		this.xAxisDate = xAxisDate;
	}

	public String getyAxisDate() {
		return yAxisDate;
	}

	public void setyAxisDate(String yAxisDate) {
		this.yAxisDate = yAxisDate;
	}

	public String getDataOrder() {
		return dataOrder;
	}

	public void setDataOrder(String dataOrder) {
		this.dataOrder = dataOrder;
	}

	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

}
