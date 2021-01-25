package com.assignment.deadlock;

/*
 *  Creating the first thread and implementing run method 
 */

public class Thread0 extends Thread {

	public Object obj0; // object where our our thread will try to have its first access  
	public Object obj1; // object where our our thread will try to have its first access 

	public Thread0(Object obj1, Object obj2) {
		this.obj0 = obj1;
		this.obj1 = obj2;
	}

	//This method is the entry point to our thread's logic
	public void run() {
		synchronized (obj0) {
			System.out.println(Thread0.currentThread().getName() + " has accesed to obj0");
			try {
				Thread0.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread0.currentThread().getName() + " is waiting to access to obj1...");
			synchronized (obj1) {
				System.out.println(Thread0.currentThread().getName() +  " has accessed to obj1 ");
			}
		}
	}
}