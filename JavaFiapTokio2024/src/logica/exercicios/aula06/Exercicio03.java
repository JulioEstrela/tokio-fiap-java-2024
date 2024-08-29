package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		nota1 = scanner.nextDouble();
		nota2 = scanner.nextDouble();
		nota3 = scanner.nextDouble();
		nota4 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5) {
			System.out.println("Em recuperacao");
		} else {
			System.out.println("Reprovado");
		}
	}

}
