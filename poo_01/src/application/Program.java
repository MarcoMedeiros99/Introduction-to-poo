package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("medidas do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("medidas do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf(" a area do triangulo x é %.4f%n", areaX);
		System.out.printf(" a area do triangulo y é %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O triangulo x é maior");
		} else if (areaX == areaY) {
			System.out.println("Os triangulos tem a mesma area");
		} else {
			System.out.println("O triangulo y é maior");
		}

		sc.close();

	}

}
