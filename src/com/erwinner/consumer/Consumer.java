package com.erwinner.consumer;

import java.util.Random;

import com.erwinner.consumer.model.Cigarro;
import com.erwinner.resources.Resources;

public class Consumer extends Thread {
	private Resources resorces;

	public Consumer(Resources resorces,String nameThread) {
		super(nameThread);
		this.resorces=resorces;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Cigarro consumer = resorces.consumer();
				System.out.println(getName()+", Mateiral: "+consumer.toString());
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	

}
