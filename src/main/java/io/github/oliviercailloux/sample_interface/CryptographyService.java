package io.github.oliviercailloux.sample_interface;

public class CryptographyService {
	final private Computer internalComputer;

	public CryptographyService(Computer computer) {
		internalComputer = computer;
	}

	/**
	 * FIXME Not implemented yet!
	 */
	public byte[] encrypt(String message) {
		/**
		 * The idea here is that this service uses its computer to test primality (and
		 * other stuff) to encrypt the given message.
		 */
		internalComputer.isPrime(3);
		return message.getBytes();
	}
}
