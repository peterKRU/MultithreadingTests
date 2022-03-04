package threads.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i < 5; i++) {
			
			executor.execute(new Processor(i));
			
		}
		
		executor.shutdown();
		
	}

}
