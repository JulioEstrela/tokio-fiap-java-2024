package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		if (numero1 == numero2) {
			System.out.printf("Os numeros %d e %d sao iguais\n", numero1, numero2);
		} else if (numero1 > numero2) {
			System.out.printf("O numero %d e maior que o numero %d\n", numero1, numero2);
		} else {
			System.out.printf("O numero %d e maior que o numero %d\n", numero2, numero1);
		}
	}

}
