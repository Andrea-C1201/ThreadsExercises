/*******************************************************************************
 * Copyright (C) 2019 Andrea-C1201
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package io.andrea_c.evenoddcounter;

/**
 * This is the {@link Thread} that will produce incrementally-generated numbers
 * from 0 to a specific value and says if the generated value is even or odd.
 * 
 * @see Thread 
 * @see Runnable
 * 
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class EvenOddThread extends Thread {

	/**
	 * This enum is used by {@link EvenOddThread} class. It says to the thread if it
	 * has to check even numbers or odd one.
	 * 
	 * @author Andrea-C1201
	 */
	public enum ValueCalculationType {
		EVEN, ODD;
	}

	/**
	 * The delay time, used in the {@link EvenOddThread#run() run} method, by
	 * {@link Thread#sleep(long) sleep}.
	 */
	private final int DELAY = 500;

	/**
	 * The type of this thread: even or odd.
	 */
	private ValueCalculationType numberType;

	/**
	 * The last number of the sequence.
	 */
	private final int finalNumber;

	/**
	 * Constructor.
	 * 
	 * @param number the target number of the counter
	 * @param type   of the thread: {@link ValueCalculationType#EVEN even} or
	 *               {@link ValueCalculationType#ODD odd}.
	 */
	public EvenOddThread(int number, ValueCalculationType type) {
		this.finalNumber = number;
		this.numberType = type;
	}

	/**
	 * <p>
	 * This is the run method invoked on the {@linkplain Thread#start() thread
	 * execution}.
	 * </p>
	 * 
	 * <p>
	 * It count from 0 to {@linkplain EvenOddThread#finalNumber finalNumber} and
	 * print the process name and if the number is even or odd. Then put this thread
	 * to the {@link Thread#sleep(long) sleep} status.
	 * </p>
	 * 
	 * @see Runnable
	 */
	@Override
	public void run() {
		// ME!ME!ME! japanese song by Daoko & TeddyLoid
		String meMeMe = Thread.currentThread().getName();
		for (int i = 1; i < finalNumber + 1; i++) {
			if (numberType.equals(ValueCalculationType.EVEN)) {
				if (i % 2 == 0)
					System.out.println(meMeMe + " - Even " + i);
			} else {
				if (i % 2 != 0)
					System.out.println(meMeMe + " - Odd " + i);
			}
			try {
				sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
