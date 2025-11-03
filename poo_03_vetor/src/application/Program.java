package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			int numero = sc.nextInt();
			vect[i] = new Product(numero);
		}

		System.out.println("numeros negativos: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumero() < 0) {
				System.out.println(vect[i].getNumero());
			}
		}

		sc.close();
	}

}
