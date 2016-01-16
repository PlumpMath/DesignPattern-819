package c5_singleton;

public class SingletonDoubleCheck {
	
	/*
	 * This reduce the use of synchronization in getInstance()
	 */
	
	private volatile static SingletonDoubleCheck uniqueInstance;
	
	private SingletonDoubleCheck(){}
	
	public static SingletonDoubleCheck getInstance() {
		if(uniqueInstance==null) {
			synchronized (SingletonDoubleCheck.class) {
				if(uniqueInstance==null) {
					uniqueInstance = new SingletonDoubleCheck();
				}
			}
		}
		return uniqueInstance;
	}
	

}
