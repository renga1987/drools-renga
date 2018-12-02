package com.javainuse.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String orderType;
	private List<String> solutionType = new ArrayList<>();
	private String jobType;
	private String estimationPoint;
	private int weightAge;
	private String solType;
	
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public List<String> getSolutionType() {
		return solutionType;
	}
	public void setSolutionType(List<String> solutionType) {
		this.solutionType = solutionType;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getEstimationPoint() {
		return estimationPoint;
	}
	public void setEstimationPoint(String estimationPoint) {
		this.estimationPoint = estimationPoint;
	}
	public int getWeightAge() {
		return weightAge;
	}
	public void setWeightAge(int weightAge) {
		this.weightAge = weightAge;
	}
	public String getSolType() {
		return solType;
	}
	public void setSolType(String solType) {
		this.solType = solType;
	}
	
}