package sec05.exam04;

public class Singleton {
	private static Singleton Singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return Singleton;
	}
}
