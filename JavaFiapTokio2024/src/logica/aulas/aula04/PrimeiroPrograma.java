package logica.aulas.aula04;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.printf("Olá, %s!\n", nome);
		
		int idade;
		idade = 18;
		System.out.printf("Voce tem %d anos\n", idade);
		
		idade = 42;
		System.out.println(idade);
		
		double salario = 1500.0;
		System.out.println(salario);
	}

}
