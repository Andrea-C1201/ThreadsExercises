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

package io.andrea_c.threadexercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * A static array that stores the 7 Disney's dwarfs names.
	 */
	private static String[] NANI = { "Dotto", "Brontolo", "Pisolo", "Mammolo", "Gongolo", "Eolo", "Cucciolo" };

	/**
	 * <s>Lazy programming:</s>
	 * <p>
	 * This is the main of this program. It creates a {@link List} of thread with a name
	 * took from {@link Main#NANI} and starts them.
	 * </p>
	 * 
	 * @see NANIThread
	 * 
	 * @param args Command line arguments. Unused.
	 */
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < NANI.length; i++) {
			threads.add(new NANIThread(NANI[i]));
		}

		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).start();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}

}
