package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantQuartos = 10;
		
		int quartos[] = new int[quantQuartos];
		
		System.out.println("quantos estudande vao se hospedar : ");
		int estudantes = sc.nextInt();
		
		String estudanteNome;
		String estudanteEmail;
				
		for(int i = 0; i < estudantes; i++) {
			sc.nextLine(); // tapar enter anterior
			
			System.out.printf("Digite o nome do %dº estudante: %n", i + 1);
			estudanteNome = sc.nextLine();
			System.out.printf("Digite o email do %dº estudante: %n", i + 1);
			estudanteEmail = sc.nextLine();	
			System.out.printf("Digite o quarto do %dº estudante: %n", i + 1);
			quartos[] = sc.nextInt();	
		}
		


		sc.close();
	}

}
