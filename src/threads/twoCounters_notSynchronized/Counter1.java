package threads.twoCounters_notSynchronized;

public class Counter1 implements Runnable{
	

	
	@Override
	public void run() {
		
		for(int i = 0; i < 10000; i++) {
			
			Runner.count++;
			
		}
		
	}

}
