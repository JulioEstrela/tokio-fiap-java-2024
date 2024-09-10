package logica.exercicios.aula09;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		char vetor[] = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o caractere %d: ", i+1);
			vetor[i] = scanner.next().charAt(0);
		}
		
		// Depois de preencher o vetor, você deverá inverter o seu conteúdo
		for (int i = 0; i < n / 2; i++) {
			char temp = vetor[i];
			vetor[i] = vetor[n - i - 1];
			vetor[n - i - 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(vetor[i]);
		}
	}

}
