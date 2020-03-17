package io.github.oliviercailloux.sample_interface;

public interface Computer {
	/**
	 * Returns <code>true</code> iff the given number is prime.
	 * 
	 * @param number a non-negative number.
	 * @return <code>true</code> iff the given number is not divisible by anything
	 *         except 1 and itself.
	 */
	public boolean isPrime(int number);
}
