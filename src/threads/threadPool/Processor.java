package threads.threadPool;

public class Processor implements Runnable{
	
	private int id;
	
	public Processor(int id) {
		
		this.id = id;
		
	}

	@Override
	public void run() {
			
		System.out.println("Starting process: " + id);
		
		try {
			Thread.sleep(1000);
			System.out.println("Finished process: " + id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
