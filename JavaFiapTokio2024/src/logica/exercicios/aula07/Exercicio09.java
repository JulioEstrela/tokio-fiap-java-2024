package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Insira um numero positivo:");
			numero = scanner.nextInt();
			if (numero <= 0) {
				System.out.println("Numero invalido");
			}
		} while(numero <= 0);
		
		System.out.println();
		System.out.printf("Divisores de %d\n", numero);	
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
	}
}
