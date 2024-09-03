package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int numeroInserido;
		
		for (int i = 1; i <= 12; i++) {
			System.out.printf("Digite o numero %d: ", i);
			numeroInserido = scanner.nextInt();
			if (numeroInserido > maiorNumero) {
				maiorNumero = numeroInserido;
			}
		}
		System.out.println("Maior numero inserido: " + maiorNumero);
	}
}
