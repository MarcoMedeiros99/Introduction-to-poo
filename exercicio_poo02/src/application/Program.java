package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Digite o nome do funcionario: ");
		employee.name = sc.nextLine();
		System.out.println("Qual é o salario bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("qual é o valor do imposto : ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println(employee.toString1());

		System.out.println();
		System.out.println("which percentage to increase salary ? ");
		employee.percentage = sc.nextDouble();

		System.out.println();
		System.out.println(employee.toString2());

		sc.close();
	}

}
