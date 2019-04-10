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
 * This add a value to the total...
 * 
 * @author Andrea-C1201
 */
public class SumThread implements Runnable {

	/**
	 * Result instance
	 */
	private Result r;

	/**
	 * The value to add
	 */
	private int value;

	/**
	 * Constructor.
	 * 
	 * @param r     the {@link Result} instance
	 * @param value the value to add to the result
	 */
	public SumThread(Result r, int value) {
		this.r = r;
		this.value = value;
	}

	/**
	 * Add {@link SumThread#value} to the result.
	 */
	@Override
	public void run() {
		r.addValue(value);
	}

}
