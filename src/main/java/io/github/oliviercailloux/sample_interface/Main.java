package io.github.oliviercailloux.sample_interface;

public class Main {
	public static void main(String[] args) {
		/** Let’s choose the ecological one. */
		EcologicalComputer ecolo = new EcologicalComputer();
		/**
		 * Note that we can assign this computer to a variable having a compatible type.
		 */
		Computer computer = ecolo;
		/**
		 * Calling isPrime invokes the method that corresponds to the runtime type of
		 * computer (here: EcologicalComputer).
		 */
		computer.isPrime(3);

		CryptographyService service = new CryptographyService(ecolo);

		/** The following instruction would have produced the same effect. */
//		CryptographyService service = new CryptographyService(computer);

		service.encrypt("stuff");
	}
}
