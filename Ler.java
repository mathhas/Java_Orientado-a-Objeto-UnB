package leitura;

import java.util.Scanner;

public class Ler {
	public static char lerChar() {
		Scanner ler = new Scanner(System.in);
		return ler.next().trim().toLowerCase().charAt(0);
	}

	public static String lerString() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine().trim();
	}

	public static int lerInt() {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

	public static float lerFloat() {
		Scanner ler = new Scanner(System.in);
		return ler.nextFloat();
	}

	public static double lerDouble() {
		Scanner ler = new Scanner(System.in);
		return ler.nextDouble();
	}

}
