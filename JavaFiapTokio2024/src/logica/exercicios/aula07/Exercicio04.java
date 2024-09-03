package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o numero %d: ", i);
			soma += scanner.nextInt();
		}
		System.out.println("Soma: " + soma);
	}
}
