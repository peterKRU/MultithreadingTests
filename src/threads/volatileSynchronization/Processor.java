package threads.volatileSynchronization;

public class Processor implements Runnable{
	
	private volatile boolean isRunning = true;
	
	@Override
	public void run() {
		
		while(isRunning) {
			
			try {
				System.out.println("Running...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void stopRunning() {
		
		isRunning = false;
		
	}
	
}
