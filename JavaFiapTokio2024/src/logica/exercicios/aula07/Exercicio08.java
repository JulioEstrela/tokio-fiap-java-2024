package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.println("Insira um numero positivo:");
			numero = scanner.nextInt();
			if (numero <= 0) {
				System.out.println("Numero invalido");
			}
		} while(numero <= 0);
		
		for (int i = 1; i <= numero; i++) {
			soma += i;
		}
		
		System.out.printf("Soma de 1 ate %d: %d\n", numero, soma);
	
		
	}
}
