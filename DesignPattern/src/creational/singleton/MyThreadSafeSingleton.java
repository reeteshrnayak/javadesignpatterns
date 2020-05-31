package creational.singleton;

public class MyThreadSafeSingleton {
	
	// The volatile keyword marks a variable that always goes to the main memory
	// for both reads and writes of the multiple threads
	private static volatile MyThreadSafeSingleton uniqueInstance; 
	
	private MyThreadSafeSingleton() {} // private constructor
	
	//  Double-checked locking getInstance method
	public static MyThreadSafeSingleton getInstance() {
		if(null == uniqueInstance) {
			synchronized(MyThreadSafeSingleton.class) { 
				if(null == uniqueInstance) {
					uniqueInstance = new MyThreadSafeSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
