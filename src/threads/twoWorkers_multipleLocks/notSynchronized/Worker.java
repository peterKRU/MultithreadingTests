package threads.twoWorkers_multipleLocks.notSynchronized;

import java.util.ArrayList;

public class Worker {
	
	private ArrayList<Integer> arr1 = new ArrayList<Integer>();
	private ArrayList<Integer> arr2 = new ArrayList<Integer>();
	
	public void stageOne() throws InterruptedException {
		
		Thread.sleep(1);
		arr1.add(1);
		
	}
	
	public void stageTwo() throws InterruptedException {
		
		Thread.sleep(1);
		arr2.add(1);
		
	}
	
	public void process() throws InterruptedException {
		
		for(int i = 0; i < 1000; i++) {
			
			stageOne();
			stageTwo();
			
		}
		
	}
	
	public void control() {
		
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Finished.");
		
		System.out.println("Total time: " + (end-start));
		System.out.println("List 1: " + arr1.size() + " " + "List 2: " + arr2.size());
		
	}
	
}
