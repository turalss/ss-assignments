package com.assignment.deadlock;




public class TestDriver {

	public static void main(String[] args) {
		
		Object obj0 = new Object();
		Object obj1 = new Object();
		
		Thread0 thread0 = new Thread0(obj0, obj1);
		Thread1 thread1 = new Thread1(obj0, obj1);
		
		thread0.start();
		thread1.start();
	}

}
