package threads.counters_nonStaticInteger;

import java.util.concurrent.BlockingQueue;

public class Runner {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		BlockingQueue<Integer> blockingQueue = controller.getBlockingQueue();
		
		Counter1 counter1 = new Counter1(blockingQueue);
		Counter2 counter2 = new Counter2(blockingQueue);
		
		Thread t1 = new Thread(counter1);
		Thread t2 = new Thread(counter2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total count: " + blockingQueue.size());
		System.out.println(blockingQueue); 
		
	}

}
