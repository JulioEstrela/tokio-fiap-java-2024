package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu gênero:");
		System.out.println("[ M ] para masculino");
		System.out.println("[ F ] para feminino");
		System.out.println("[ O ] outro");
		System.out.println("[ N ] não responder");
		
		char genero = scanner.next().charAt(0);

		System.out.printf("Olá, %s! Voce escolheu a seguinte opcao de genero: %c\n", nome, genero);
	}

}
