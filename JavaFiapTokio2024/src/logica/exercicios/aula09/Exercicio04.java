package logica.exercicios.aula09;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double notas[] = new double[n];
		double soma = 0;
		
		int igual = 0;
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < n; i++) {
			notas[i] = scanner.nextDouble();
			soma += notas[i];
		}
		double media = soma / n;
		for (double nota : notas) {
			if (nota == media) {
				igual++;
			} else if (nota > media) {
				maior++;
			} else {
				menor++;
			}
		}
		
		System.out.println("Media: " + media);
		System.out.println("Quantidade de notas iguais a media: " + igual);
		System.out.println("Quantidade de notas superiores a media: " + maior);
		System.out.println("Quantidade de notas inferiores a media: " + menor);

	}

}
