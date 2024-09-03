package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String escolha;
		do {
			System.out.println("Olá, Mundo");
			
			System.out.println("Exibir a mensagem novamente? (Sim / Não)");
			escolha = scanner.next();
		} while (escolha.toLowerCase().equals("sim"));
		System.out.println("Fim");
	}

}
