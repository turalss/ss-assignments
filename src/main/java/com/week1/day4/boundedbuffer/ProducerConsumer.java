package com.week1.day4.boundedbuffer;

import java.util.LinkedList;

/*
 *  Application for proper communication purposes to access to a bounded buffer
 */

public class ProducerConsumer {

	LinkedList<Integer> items = new LinkedList<>(); // shared list used by consumer and producer
	private int listSize; // size of the array will be determined at instantiation

	public ProducerConsumer(int listSize) {
		this.listSize = listSize;
	}

	public void produceItems() throws InterruptedException {

		int value = 0;

		while (true) {
			System.out.println(items.size() + " : " + listSize);
			synchronized (this) {

				if (items.size() == listSize) {

					System.out.println(items.size() + " : " + listSize);

					try {

						wait();
						System.out.println("List is full. Producer waiting consumer to consume items ... ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				items.add(++value);
				System.out.println("item: " + value + " added to the list by produser");

				notify();
				System.out.println("notifying consumer that new items are available");

				Thread.sleep(1000);
			}

		}

	}

	public void consumeItem() throws InterruptedException {

		int value = 0;

		while (true) {
			System.out.println(items.size() + " : " + listSize);
			synchronized (this) {

				if (items.size() == 0) {

					try {
						wait();
						System.out.println("List is empty, consumer waiting producer to produce new iterms ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {

					value = items.removeFirst();
					System.out.println("consumer has consumed item: " + value);

					System.out.println(items.size() + " : " + listSize);

					notify();
					System.out.println("notifying producer to wake up and stat to produce");

					Thread.sleep(1000);
				}

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumer producerConsumer = new ProducerConsumer(1); // initializing size of the items list

		Thread thread0 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producerConsumer.produceItems();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					producerConsumer.consumeItem();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		thread0.start();
		thread1.start();

	}

}
