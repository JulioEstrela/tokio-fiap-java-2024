package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroInserido;
		
		System.out.println("Digite um valor:");
		numeroInserido = scanner.nextInt();
		
		System.out.println();
		System.out.printf("Valores pares entre 2 e %d:\n", numeroInserido);
		for (int i = 2; i < numeroInserido; i += 2) {
			System.out.println(i);
		}
	}
}
