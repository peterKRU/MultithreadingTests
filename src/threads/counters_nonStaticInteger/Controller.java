package threads.counters_nonStaticInteger;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Controller {
	
	private BlockingQueue<Integer> blockingQueue;
	
	public Controller() {
		
		blockingQueue = new ArrayBlockingQueue<Integer>(30);
		
	}

	public BlockingQueue<Integer> getBlockingQueue() {
		return blockingQueue;
	}


	
}
