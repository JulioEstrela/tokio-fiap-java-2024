package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = scanner.nextInt();
		
		System.out.println();
		System.out.println("Tabuada");
		for (int i = 0; i <= 25; i++) {
			System.out.printf("%d x %-2d = %-2d\n", numero, i, numero * i);
		}
	}
}
