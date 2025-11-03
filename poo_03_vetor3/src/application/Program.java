package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantas pessoas iram ser cadastradas? ");
		n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();

			System.out.printf("Dados da " + (i + 1) + "ª pessoa:%n");

			System.out.println("Nome: ");
			nomes[i] = sc.nextLine();

			System.out.println("Idade: ");
			idades[i] = sc.nextInt();

			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}
		double mediaAltura = soma / n;

		System.out.printf("ALTURA MÉDIA: %.2f%n", mediaAltura);

		int menor16 = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				menor16 = menor16 + 1;
			}
		}
		double percent = menor16 * 100.0 / n;
		System.out.printf("Porcentagem: %.1f%%%n", percent);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}
}
