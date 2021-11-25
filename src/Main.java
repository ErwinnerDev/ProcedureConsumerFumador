import com.erwinner.Producer.ProducerFosforo;
import com.erwinner.Producer.ProducerPapel;
import com.erwinner.Producer.ProducerTap;
import com.erwinner.consumer.Consumer;
import com.erwinner.resources.Resources;

public class Main {

	public static void main(String[] args) {
		Resources resource = new Resources(); 
		
		ProducerFosforo producerFosforo1 = new ProducerFosforo(resource,"Fosforo-1");
		//ProducerFosforo producerFosforo2 = new ProducerFosforo(resource,"Fosforo-2");
		
		ProducerPapel producerPapel1 = new ProducerPapel(resource,"Papel-1");
		//ProducerPapel producerPapel2 = new ProducerPapel(resource,"Papel-2");
		
		ProducerTap  producerTap1 = new ProducerTap(resource,"Tap-1");
		//ProducerTap  producerTap2 = new ProducerTap(resource,"Tap-2");
		

		Consumer consumer = new Consumer(resource,"Consumer >>> Fumador con cigarro");

		
		producerFosforo1.start();
		//producerFosforo2.start();
		
		producerPapel1.start();
		//producerPapel2.start();
		
		producerTap1.start();
		//producerTap2.start();
		
		consumer.start();
	}

}
