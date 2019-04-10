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

/**
 * Thread that print 7 sequenced numbers. Ok...
 * 
 * @see Thread
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class NANIThread extends Thread {

	/**
	 * Constructor. Sets the name of this thread.
	 * 
	 * @see Thread#setName(String)
	 * @param name the thread name
	 */
	public NANIThread(String name) {
		setName(name);
	}

	/**
	 * Print numbers from 1 to 7 and the {@linkplain Thread#getName() thread name}.
	 */
	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println((i + 1) + getName());
		}
	}
}
