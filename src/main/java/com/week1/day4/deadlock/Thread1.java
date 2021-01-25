package com.week1.day4.deadlock;
/*
 *  Creating the second thread and implementing run method 
 */

public class Thread1 extends Thread {

	public Object obj0;
	public Object obj1;

	public Thread1(Object obj1, Object obj2) {
		this.obj0 = obj1;
		this.obj1 = obj2;
	}

	// This method is the entry point to our thread's logic
	public void run() {
		synchronized (obj1) {
			System.out.println(Thread0.currentThread().getName() + " has accesed to obj1");
			try {
				Thread0.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread0.currentThread().getName() + " is waiting to access to obj0...");
			synchronized (obj0) {
				System.out.println(Thread0.currentThread().getName() + " has accessed to obj0");
			}

		}
	}
}