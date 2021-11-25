package com.erwinner.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


import com.erwinner.consumer.controller.FabricarCigarro;
import com.erwinner.consumer.model.Cigarro;
import com.erwinner.consumer.model.DetalleCigarro;
import com.erwinner.consumer.model.ProcedureType;

public class Resources {
	private List<ProcedureType> resource = new ArrayList<>();;
	private FabricarCigarro objCigarro;
	
	public Resources() {
		objCigarro= new FabricarCigarro();
		
	}

	public synchronized void producer(String type,int value) { // synchronized para que un solo Hilo pueda accedar a la vez
		resource.add(new ProcedureType(type,value));
		if(objCigarro.validarMaterialCigarro(resource)!=null) {
			notifyAll(); // para avisarle a todos los hilos que ya hay elementos
		}
	}
	
	public synchronized Cigarro consumer() throws InterruptedException { // synchronized para que un solo Hilo pueda accedar a la vez
		
		while(objCigarro.createCigarro(resource)==null) { // debe sre el operador directo, no por varaiable**
			wait(); // Hace que el hilo actual espere hasta que se despierte, o notifique que hay elementos  
		}
		DetalleCigarro cigarro = objCigarro.createCigarro(resource);
		System.out.println("size array:"+resource.size());
		for(Entry<String, ProcedureType> entrySet : cigarro.getMapPosicion().entrySet()) {
			resource.removeIf(o -> o==entrySet.getValue());
		}
		System.out.println("size array:"+resource.size());
		return cigarro.getCigarro();
	}

}
