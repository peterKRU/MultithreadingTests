package threads.twoWorkers_multipleLocks.objectLocks;

public class Runner {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		worker.control();
		
	}

}
