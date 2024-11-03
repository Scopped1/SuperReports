package it.scopped.superreports.code;

import java.util.Random;

public class CodeGenerator {
	private static final Random random = new Random();

	public static int generate() {
		return generate(6);
	}

	public static int generate(int length) {
		int min = (int) Math.pow(10, length - 1);
		int max = (int) Math.pow(10, length) - 1;

		return random.nextInt(max - min + 1) + min;
	}
}