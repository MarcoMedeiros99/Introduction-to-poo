package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DataBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DataBank dataB;

		System.out.print("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do titular: ");
		String name = sc.nextLine();
		System.out.println("Deseja fazer um deposito ? s/n");
		String resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor á depositar : R$ ");
			double aporteInicial = sc.nextDouble();
			sc.nextLine();
			dataB = new DataBank(numeroConta, name, aporteInicial);

			System.out.println();
			System.out.println("Dados atualizados:");
			System.out.println("Numero da conta: " + numeroConta + ", Titular da conta: " + name + ", Saldo em conta: "
					+ dataB.getSaldo());

			System.out.println();
		} else {

			dataB = new DataBank(numeroConta, name);
			System.out.println("Numero da conta: " + numeroConta + ", Titular da conta: " + name + ", Saldo em conta: "
					+ dataB.getSaldo());

			System.out.println();
		}

		String resposta2 = "";

		while (!resposta2.equals("3")) {

			System.out.println("Deseja realizar outra transaçao ?");
			System.out.println(" * DIGITE *");
			System.out.println("1 -  SACAR");
			System.out.println("2 -  DEPOSITAR");
			System.out.println("3 - FINALIZAR");
			resposta2 = sc.nextLine();
			
			System.out.println();

			if (resposta2.equals("1")) {
				System.out.println("Usuario: " + name);
				System.out.println(" Numero da conta: " + numeroConta);
				System.out.println("Saldo em conta: R$ " + dataB.getSaldo());

				System.out.print("Quanto voce quer sacar ? R$ ");
				double valorSaque = sc.nextDouble();
				sc.nextLine();
				dataB.saque(valorSaque);
				
				System.out.println();

				System.out.println("Numero da conta: " + numeroConta + ", Titular da conta: " + name
						+ ", Saldo em conta atualizado: " + dataB.getSaldo());

				System.out.println();
			} else if (resposta2.equals("2")) {
				System.out.println("Usuario: " + name);
				System.out.println(" Numero da conta: " + numeroConta);
				System.out.println("Saldo em conta: R$ " + dataB.getSaldo());

				System.out.print("Quanto voce quer depositar ? R$ ");
				double valorAporte = sc.nextDouble();
				sc.nextLine();
				dataB.aporte(valorAporte);

				System.out.println("Numero da conta: " + numeroConta + ", Titular da conta: " + name
						+ ", Saldo em conta atualizado: " + dataB.getSaldo());

				System.out.println();
			} else if (resposta2.equals("3")) {
				System.out.println("Obrigado, volte sempre");
			} else {
				System.out.println("resposta invalida!");
			}
		}

		sc.close();
	}

}
