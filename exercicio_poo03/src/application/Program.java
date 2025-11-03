package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Situation;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Situation sit = new Situation();
		
		sit.name = sc.nextLine();
		sit.grade1 = sc.nextDouble();
		sit.grade2 = sc.nextDouble();
		sit.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", sit.finalGrade());
		if (sit.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", sit.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
