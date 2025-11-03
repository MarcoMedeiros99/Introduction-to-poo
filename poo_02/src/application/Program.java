package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Qual é o seu produto a ser cadastrado? ");
		String name = sc.nextLine();
		System.out.println("Qual é o preço unitario do seu produto? ");
		double price = sc.nextDouble();
		System.out.println("Digite a quantidade do seu produto : ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + product.toString());

		System.out.println();
		System.out.print("entre com a quantidade de produtos a ser adicionado ao estoque: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());

		System.out.println();
		System.out.print("entre com a quantidade de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());

		sc.close();
	}

}
