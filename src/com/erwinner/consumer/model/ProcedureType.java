package com.erwinner.consumer.model;

public class ProcedureType {
	private String typeProcedure;
	private Integer value;
	
	
	public ProcedureType() {
	}


	public ProcedureType(String typeProcedure, Integer value) {
		super();
		this.typeProcedure = typeProcedure;
		this.value = value;
	}


	public String getTypeProcedure() {
		return typeProcedure;
	}


	public void setTypeProcedure(String typeProcedure) {
		this.typeProcedure = typeProcedure;
	}


	public Integer getValue() {
		return value;
	}


	public void setValue(Integer value) {
		this.value = value;
	}
	

}
