package io.andrea_c.evenoddcounter;

public class Main {

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
