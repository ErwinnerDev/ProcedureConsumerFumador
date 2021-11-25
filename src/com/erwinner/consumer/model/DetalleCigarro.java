package com.erwinner.consumer.model;

import java.util.Map;

public class DetalleCigarro {
	private Cigarro cigarro;
	private Map<String,ProcedureType> mapPosicion;
	
	public DetalleCigarro(Cigarro cigarro, Map<String, ProcedureType> mapPosicion) {
		super();
		this.cigarro = cigarro;
		this.mapPosicion = mapPosicion;
	}

	public Cigarro getCigarro() {
		return cigarro;
	}

	public void setCigarro(Cigarro cigarro) {
		this.cigarro = cigarro;
	}

	public Map<String, ProcedureType> getMapPosicion() {
		return mapPosicion;
	}

	public void setMapPosicion(Map<String, ProcedureType> mapPosicion) {
		this.mapPosicion = mapPosicion;
	}
	
	

}
