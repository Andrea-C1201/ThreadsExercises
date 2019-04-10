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

package io.andrea_c.parallelthread;

/**
 * This class make the power of an array of integers, number by number.
 * 
 * @see Thread
 * @see Runnable
 * @author Andrea-C1201 <giandreas@outlook.it>
 *
 */
public class PowThread implements Runnable {

	/**
	 * The {@link Result} instance. Used to store the result of an operation.
	 */
	private Result result;

	/**
	 * An array that stores the values of which the {@link #run()} method will make
	 * power operation.
	 */
	private int[] values;

	/**
	 * Initialize this class with 10 values.
	 * 
	 * @param result the {@link Result} instance.
	 */
	public PowThread(Result result) {
		this(result, 10);
	}

	/**
	 * Constructor: initialize this class with the specified max value.
	 * 
	 * @param result  the {@link Result} instance.
	 * @param nValues quantity of incremental values to generate to.
	 */
	public PowThread(Result result, int nValues) {
		this.result = result;
		values = new int[nValues];
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
	}

	/**
	 * Make power of the values stored in {@link #values} array and stores it into
	 * {@link Result} instance.
	 */
	@Override
	public void run() {
		for (int i = 0; i < values.length; i++) {
			values[i] = (values[i] * values[i]);
		}
		result.storeMultipleValues(values);
	}

}
