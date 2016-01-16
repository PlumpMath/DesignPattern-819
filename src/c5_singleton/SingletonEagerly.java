package c5_singleton;

public class SingletonEagerly {
	
	/*
	 * If the application always creates and uses an instance of the class or the overhead of
	 * creation and runtime aspects of the Singleton are not onerous, you may want to create
	 * your singleton eagerly
	 */
	
	private static SingletonEagerly uniqueInstance = new SingletonEagerly();
	
	private SingletonEagerly(){}
	
	public static SingletonEagerly getInstance() {
		return uniqueInstance;
	}

}
