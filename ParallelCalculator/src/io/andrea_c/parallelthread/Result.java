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

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores an {@link Integer} value. Allows to share this value
 * between {@link PowThread} and {@link SumThread}
 * 
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class Result {

	/**
	 * Store the sum of {@link SumThread} value.
	 */
	private int result;

	/**
	 * Stores a {@link List} of {@link Integer} values.
	 */
	private List<Integer> results = new ArrayList<>();

	/**
	 * Initialize this class.
	 */
	public Result() {
		this(0);
	}

	/**
	 * Initialize this class that starts from a specific value
	 * 
	 * @param initialValue the specified value
	 */
	public Result(int initialValue) {
		this.result = initialValue;
	}

	/**
	 * Add the specified value to this result instance
	 * 
	 * @param amount
	 */
	public void addValue(int amount) {
		this.result += amount;
	}

	/**
	 * @return an int value that represent the result value.
	 */
	public int getValue() {
		return this.result;
	}

	/**
	 * Add value to the result list
	 * 
	 * @param value the single value
	 */
	public void storeMultipleValue(int value) {
		results.add(value);
	}

	/**
	 * Add values to the result list
	 * 
	 * @param values a group of values
	 */
	public void storeMultipleValues(int... values) {
		for (int i = 0; i < values.length; i++) {
			results.add(values[i]);
		}
	}

	/**
	 * 
	 * @return the {@link List} of results.
	 */
	public List<Integer> getValues() {
		return results;
	}

}
