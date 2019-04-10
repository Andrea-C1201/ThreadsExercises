package io.andrea_c.evenoddcounter;

/**
 * 
 * 
 * @author Andrea-C1201 <giandreas@outlook.it>
 */
public class EvenOddThread extends Thread {

	public enum ValueCalculationType {
		EVEN, ODD;
	}

	private final int DELAY = 500;
	private ValueCalculationType numberType;
	private final int finalNumber;

	public EvenOddThread(int number, ValueCalculationType type) {
		this.finalNumber = number + 1;
		this.numberType = type;
	}

	@Override
	public void run() {
		for (int i = 0; i < finalNumber; i++) {
			if (numberType.equals(ValueCalculationType.EVEN)) {
				if (i % 2 == 0)
					System.out.println("Even " + i);
			} else {
				if (i % 2 != 0)
					System.out.println("Odd " + i);
			}
			try {
				sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
