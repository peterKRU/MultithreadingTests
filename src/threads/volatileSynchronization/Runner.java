package threads.volatileSynchronization;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Processor processor = new Processor();
		Thread processorThread = new Thread(processor);
		processorThread.start();
		
		System.out.println("Press enter to stop.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		processor.stopRunning();
		System.out.println("Not running.");
		scanner.close();
		
	}

}
