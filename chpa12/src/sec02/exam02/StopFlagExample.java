package sec02.exam02;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try{Thread.sleep(5000);} catch(InterruptedException e) {}
		
		printThread.setStop(true);
	}

}
