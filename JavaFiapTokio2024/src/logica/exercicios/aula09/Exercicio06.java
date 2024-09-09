package logica.exercicios.aula09;

import java.util.Iterator;
import java.util.Scanner;

// a somatória deverá ser feita após o vetor estar preenchido
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int vetor[] = new int[n];
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			vetor[i] = scanner.nextInt();
		}
		
		for (int num : vetor) {
			soma += num;
		}
		
		System.out.println(soma);
	}

}
