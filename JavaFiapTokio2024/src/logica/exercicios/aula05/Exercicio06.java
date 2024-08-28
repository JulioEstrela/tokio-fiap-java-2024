package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o nome da peça 1: ");
		String nomePeca1 = scanner.nextLine();
		System.out.printf("Digite a quantidade da peça 1: ");
		int qtdPeca1 = scanner.nextInt();
		System.out.printf("Digite o valor da peça 1: ");
		double valorPeca1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.printf("Digite o nome da peça 2: ");
		String nomePeca2 = scanner.nextLine();
		System.out.printf("Digite a quantidade da peça 2: ");
		int qtdPeca2 = scanner.nextInt();
		System.out.printf("Digite o valor da peça 2: ");
		double valorPeca2 = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Valor a ser pago:");
		double totalPeca1 = valorPeca1 * qtdPeca1;
		System.out.printf("Total %s: %f\n", nomePeca1, totalPeca1);
		System.out.println();
		double totalPeca2 = valorPeca2 * qtdPeca2;
		System.out.printf("Total %s: %f\n", nomePeca2, totalPeca2);
		
		System.out.println();
		System.out.println("Total: " + (totalPeca1 + totalPeca2));	
	}

}
