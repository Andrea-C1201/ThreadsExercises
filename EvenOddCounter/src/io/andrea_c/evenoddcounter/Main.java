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
 * This is the main class for this exercise (ex.11 pg.129)
 * 
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class Main {

	/**
	 * <p>
	 * This is the main of the program.
	 * </p>
	 * <p>
	 * It gets the number from the command line arguments array and tries to convert
	 * from a string into an integer value.
	 * </p>
	 * <p>
	 * If it succeed, it starts 2 threads, one count the even numbers and the other
	 * the odd one, from 1 to the inserted number. Then it waits for the threads to
	 * end. ({@link Thread#join()})
	 * </p>
	 * <p>
	 * If it fail, it enter in the catch block, usually for an
	 * {@link NumberFormatException} and simple exit the program.
	 * </p>
	 * 
	 * @param args in this case, an integer number
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: java -jar [filename.jar] [NUMBER]");
			System.err.println("Or add a value to the Debug/Run configuration in your IDE.");
			return;
		}

		try {
			int number = Integer.parseInt(args[0]);
			Thread even = new EvenOddThread(number, EvenOddThread.ValueCalculationType.EVEN);
			Thread odd = new EvenOddThread(number, EvenOddThread.ValueCalculationType.ODD);
			even.start();
			odd.start();
			even.join();
			odd.join();
		} catch (Exception e) {
			System.err.println("The inserted value is wrong: " + args[0]);
			return;
		}
	}

}
