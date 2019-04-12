package io.andrea_c.bell;

/**
 * This program print 5 times "Din", "Don" or "Dan" Where is Fra Martino?
 * 
 * @author Andrea-C1201
 */
public class BellMain {

	public static void main(String[] args) {
		Runnable din = new Bell("Din", 5);
		Thread dinThread = new Thread(din);
		dinThread.start();
		Thread don = new Thread(new Bell("Don", 5));
		don.start();
		new Thread(new Bell("Dan", 5)).start();
	}
}
