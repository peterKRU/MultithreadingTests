package threads.countdownLatch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable{
	
	CountDownLatch latch;
	
	public Processor(CountDownLatch latch) {
		
		this.latch = latch;
		
	}

	@Override
	public void run() {
		
		System.out.println("Running...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		
	}
	
	
	
}
