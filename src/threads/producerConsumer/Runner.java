package threads.producerConsumer;

public class Runner {

	public static void main(String[] args) {

		Worker worker = new Worker();
		
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					worker.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread consumerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					worker.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		producerThread.start();
		consumerThread.start();
		
	}

}
