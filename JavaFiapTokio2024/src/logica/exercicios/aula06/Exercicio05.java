package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operacao = scanner.next().charAt(0);
		
		switch (operacao) {
			case '+': 
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println((float) a / b);
				break;
			default:
				System.out.println("Operacao invalida");
		}
	}

}
