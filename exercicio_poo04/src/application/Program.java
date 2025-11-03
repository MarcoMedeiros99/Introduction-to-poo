package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double priceDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollar = sc.nextDouble();
			
		double reais = CurrencyConverter.buyDollar( priceDollar, dollar);
		
		System.out.println();
		System.out.printf("Amout to be paid in reais = %.2f%n", reais);
			
	sc.close();	
	}

}