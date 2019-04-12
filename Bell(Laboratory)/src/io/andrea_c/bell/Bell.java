package io.andrea_c.bell;

public class Bell implements Runnable {

	/**
	 * The bell's sound
	 */
	private String sound;

	/**
	 * How many times the bell has to sound
	 */
	private int times;

	/**
	 * Costructor.
	 * 
	 * @param sound the bell's sound
	 * @param times the number of the execution
	 */
	public Bell(String sound, int times) {
		this.sound = sound;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println((i + 1) + sound + " ");
		}
	}

}
