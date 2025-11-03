package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rectangle = new rectangle();
		
		System.out.println("Digite o comprimento do retangulo");
		rectangle.width = sc.nextDouble();
		System.out.println("Digite o largura do retangulo");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.toString());
		
		sc.close();
	}

}
