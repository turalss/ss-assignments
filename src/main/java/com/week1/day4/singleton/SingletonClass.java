package com.week1.day4.singleton;

/*
 *  Implementing Singleton with double checked blocking
 */

public class SingletonClass {

	volatile private static SingletonClass instance;
	private int i;

	private SingletonClass() {

	};

	// double checking before creating a new instance of class
	public static SingletonClass createInstance() {
		if (instance == null) {
			// placing thread inside of synchronization block
			// it will handle a thread safe environment and only one thread in a time will
			// be executed
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		SingletonClass singleton1 = SingletonClass.createInstance();
		singleton1.setI(3);
		SingletonClass singleton2 = SingletonClass.createInstance();
		// testing second instance will
		System.out.println(singleton2.getI());

	}
}
