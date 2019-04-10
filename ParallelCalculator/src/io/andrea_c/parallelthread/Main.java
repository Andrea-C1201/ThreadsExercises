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

import java.util.ConcurrentModificationException;

/**
 * Parallel calculation...
 * 
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class Main {

	/**
	 * <p>
	 * Make a group of {@link SumThread} that sums values... Than... Make a
	 * {@link PowThread} that make power of a sequential-generated array of values.
	 * 
	 * </p>
	 * <p>
	 * The join part is needed because the way of this stores the results. If thread
	 * exit before the actual calculation, it can't add data. Also, sometimes, it
	 * throws a {@link ConcurrentModificationException}.
	 * </p>
	 * 
	 * @param args (unused in this exercise, btw) command line arguments
	 */
	public static void main(String[] args) {
		Result r = new Result();
		int j = 1;
		for (int i = 0; i < 10; i++) {
			new Thread(new SumThread(r, j)).start();
			j++;
		}
		System.out.println(r.getValue());
		Result powResult = new Result();
		Thread t = new Thread(new PowThread(powResult));
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(powResult.getValues());
	}

}
