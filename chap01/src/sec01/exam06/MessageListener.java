package sec01.exam06;

public class MessageListener implements Button.onClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
