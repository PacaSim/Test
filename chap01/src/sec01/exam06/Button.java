package sec01.exam06;

public class Button {
	onClickListener listener;
	
	void setListener(onClickListener listener) {
		this.listener = listener;
	}
	
	void click() {
		listener.onClick();
	}
	
	static interface onClickListener {
		void onClick();
		
	}
	
}
