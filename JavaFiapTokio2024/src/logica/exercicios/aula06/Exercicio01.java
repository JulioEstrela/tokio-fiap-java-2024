package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero informado e par");
		} else {
			System.out.println("O numero informado e impar");
		}
	}

}
