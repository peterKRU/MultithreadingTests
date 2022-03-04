package threads.twoWorkers_multipleLocks.notSynchronized;

public class Runner {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		worker.control();
		
	}

}
