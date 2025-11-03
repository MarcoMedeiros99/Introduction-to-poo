package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			double numero = sc.nextDouble();
			vect[i] = new Product(numero);
		}
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f%n", vect[i].getNumero());
		}
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getNumero();
		}
		double media = soma / vect.length;

		System.out.printf("Soma : %.1f%n", soma);
		System.out.printf("Media : %.1f%n", media);

		sc.close();
	}

}
