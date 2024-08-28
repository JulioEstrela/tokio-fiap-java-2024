package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		nome = scanner.nextLine();
		
		int idade;
		idade = scanner.nextInt();
		
		System.out.printf("Ola, %s. Voce tem %d anos.\n", nome, idade);
	}

}
