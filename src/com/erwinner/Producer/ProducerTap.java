package com.erwinner.Producer;

import java.util.Random;

import com.erwinner.resources.Resources;
import com.erwinner.util.EnumTypeProcedure;

public class ProducerTap extends Thread{
	private Resources resource;

	public ProducerTap(Resources resource,String nameThread) {
		super(nameThread);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Integer value = new Random().nextInt(100);
				resource.producer(EnumTypeProcedure.TYPE_TAP.getType(), value);
				System.out.println(getName()+" Produce Tabaco: "+value);
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
