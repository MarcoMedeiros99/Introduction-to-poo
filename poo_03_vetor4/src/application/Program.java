package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("quantos numeros vai digitar? ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine(); // para cobrir o enter anterior
			System.out.printf("digite o %dº numero: %n", i + 1);
			vect[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES:");
		int pares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				pares += 1;
				System.out.println(vect[i]);
			}
		}

		System.out.println("QUANTIDADE DE NUMEROS PARES: " + pares);

		sc.close();
	}

}
