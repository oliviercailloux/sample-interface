package io.github.oliviercailloux.sample_interface;

public class FastComputer implements Computer {
	/**
	 *
	 * {@inheritDoc}
	 *
	 * Tests primality in a not-so-ecological but (supposedly) “fast” way. [Note
	 * that this is only a toy example, this is not implemented and always returns
	 * false; imagine that this is implemented by dispatching parts of the
	 * computation to various computers, for example.]
	 */
	@Override
	public boolean isPrime(int number) {
		/** TODO */
		return false;
	}
}
