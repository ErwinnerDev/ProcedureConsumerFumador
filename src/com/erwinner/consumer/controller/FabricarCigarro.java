package com.erwinner.consumer.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.erwinner.consumer.model.Cigarro;
import com.erwinner.consumer.model.DetalleCigarro;
import com.erwinner.consumer.model.ProcedureType;
import com.erwinner.util.EnumTypeProcedure;

public class FabricarCigarro {

	public  DetalleCigarro createCigarro(List<ProcedureType> resource) {
		Map<String,ProcedureType> mapPosicion = null;
		
		List<ProcedureType> validarMatrialCigarro = this.validarMaterialCigarro(resource);
		if(validarMatrialCigarro!=null) {
			mapPosicion = new HashMap<>();
			for(ProcedureType material:validarMatrialCigarro) {
				mapPosicion.put(material.getTypeProcedure(), material);
			}
			return new DetalleCigarro(new Cigarro(validarMatrialCigarro.get(0).getValue()
												,validarMatrialCigarro.get(1).getValue()
												,validarMatrialCigarro.get(2).getValue())
										,mapPosicion);
		}
		return null;
	} 
	
	public  List<ProcedureType> validarMaterialCigarro(List<ProcedureType> resource){
		List<ProcedureType> listaMaterial;
		Optional<ProcedureType> findFirstPapel = resource.stream().filter(p -> p.getTypeProcedure().equals(EnumTypeProcedure.TYPE_PAPEL.getType())).findFirst();
		Optional<ProcedureType> findFirstFosforo = resource.stream().filter(f -> f.getTypeProcedure().equals(EnumTypeProcedure.TYPE_FOSFOREO.getType())).findFirst();
		Optional<ProcedureType> findFirstTabaco =resource.stream().filter(t -> t.getTypeProcedure().equals(EnumTypeProcedure.TYPE_TAP.getType())).findFirst();
		
		if(findFirstPapel.isPresent() && findFirstFosforo.isPresent() && findFirstTabaco.isPresent()) {
			listaMaterial = new ArrayList<>();
			listaMaterial.add(findFirstPapel.get());
			listaMaterial.add(findFirstFosforo.get());
			listaMaterial.add(findFirstTabaco.get());
			return listaMaterial;
		}
		return null;
	}
}
