package threads.counters_nonStaticInteger;

import java.util.concurrent.BlockingQueue;

public class Counter1 implements Runnable{
	
	private BlockingQueue<Integer> blockingQueue;
	
	public Counter1(BlockingQueue<Integer> blockingQueue) {
		
		this.blockingQueue = blockingQueue;
		
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			try {
				blockingQueue.put(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
