package threads.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Worker {
	
	BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
	
	public void produce() throws InterruptedException {
		
		while(true) {
			Thread.sleep(1000);
			blockingQueue.put(1);
		}
		
	}
	
	public void consume() throws InterruptedException {
		
		while(true) {
			Thread.sleep(1100);
			System.out.println("Queue size: " + blockingQueue.size());
			System.out.println("Consumed: " + blockingQueue.take());
		}
		
	}
	
}
