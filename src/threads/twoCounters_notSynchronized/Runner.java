package threads.twoCounters_notSynchronized;

public class Runner {
	
	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Runner runner = new Runner();
		
		for(int i = 0; i < 5; i++) {
			
			runner.doWork();
			System.out.println("Total count: " + count);
			
			count = 0;
			
		}
		
	}
	
	public void doWork() throws InterruptedException {
		
		Counter1 counter1 = new Counter1();
		Counter2 counter2 = new Counter2();
		Thread t1 = new Thread(counter1);
		Thread t2 = new Thread(counter2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
	
	
}
