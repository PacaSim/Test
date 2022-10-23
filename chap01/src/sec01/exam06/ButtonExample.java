package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		btn.setListener(new CallListener());
		btn.click();
		
		Button btn2 = new Button();
		btn2.setListener(new MessageListener());
		btn2.click();
		
	}

}
