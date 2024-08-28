package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valorProduto, valorPago;
		System.out.printf("Digite o valor do produto: ");
		valorProduto = scanner.nextDouble();
		System.out.printf("Digite o valor pago: ");
		valorPago = scanner.nextDouble();
		
		if (valorPago < valorProduto) {
			System.out.println("Valor pago foi insuficiente");
		} else {
			System.out.println("Valor do troco: " + (valorPago - valorProduto));	
		}
	}

}
