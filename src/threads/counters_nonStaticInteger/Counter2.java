package threads.counters_nonStaticInteger;

import java.util.concurrent.BlockingQueue;

public class Counter2 implements Runnable{
	
	private BlockingQueue<Integer> blockingQueue;
	
	public Counter2(BlockingQueue<Integer> blockingQueue) {
		
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
