package com.erwinner.Producer;

import java.util.Random;

import com.erwinner.resources.Resources;
import com.erwinner.util.EnumTypeProcedure;

public class ProducerFosforo extends Thread{
	
	private Resources resource;

	public ProducerFosforo(Resources resource,String nameThread) {
		super(nameThread); // se le pasa el nombre dle hilo a la clase padre
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Integer value = new Random().nextInt(100);
				resource.producer(EnumTypeProcedure.TYPE_FOSFOREO.getType(), value);
				System.out.println(getName()+" Produce Fosforo: "+value);
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
