package com.erwinner.util;

public enum EnumTypeProcedure {
	
	
	TYPE_FOSFOREO("Fosforo"),
	TYPE_PAPEL("Papel"),
	TYPE_TAP("Tabaco");
	
	private String type;
	

	 private EnumTypeProcedure(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}

	
