package c5_singleton;

/*
 *  The usage of a synchronized method each time is expensive.
 *  If the performance of getInstance() is not a problem: do nothing.
 */
public class SingletonSimple {

	private static SingletonSimple uniqueInstance;
	
	private SingletonSimple(){};
	
	public static synchronized SingletonSimple getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonSimple();
		}
		return uniqueInstance;
	}
	
}
