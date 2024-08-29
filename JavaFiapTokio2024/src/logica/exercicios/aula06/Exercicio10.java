package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		double aumento = 1;
		
		if (salario <= 280) {
			aumento = 1.2;
		} else if (salario < 700) {
			aumento = 1.15;
		} else if (salario < 1500) {
			aumento = 1.10;
		} else {
			aumento = 1.05;
		}
		
		System.out.println("Salario antes do reajuste: " + salario);
		System.out.printf("Percentual de aumento: %.0f%%\n", ((aumento * 100) - 100));
		double novoSalario = salario * aumento;
		System.out.println("Valor do aumento: " + (novoSalario - salario));
		System.out.println("Novo salario: " + novoSalario);
	}

}
