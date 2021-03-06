package threads.twoCounters_notSynchronized.nonStatic;

public class Runner {
	
	private int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Runner runner = new Runner();
		runner.doWork();
		
	}
	
	public synchronized void incrementCount() {
		
		count++;
		
	}
	
	public void doWork() {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i = 0; i < 10000; i++) {
					
					incrementCount();
					
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i = 0; i < 10000; i++) {
					
					incrementCount();
					
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total count: " + count);
		
	}
	
}
