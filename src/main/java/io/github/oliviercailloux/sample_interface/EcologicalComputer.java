package io.github.oliviercailloux.sample_interface;

import static com.google.common.base.Preconditions.checkArgument;

public class EcologicalComputer implements Computer {

	/**
	 *
	 * {@inheritDoc}
	 *
	 * Tests primality in a not-so-fast but (relatively) “ecological” way (meaning:
	 * not using the network). [Note that this is only a toy example, there are much
	 * more efficient algorithms.]
	 */
	@Override
	public boolean isPrime(int number) {
		checkArgument(number >= 0);
		boolean isPrime = true;
		for (int i = 2; i < Math.sqrt(number); ++i) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

}
