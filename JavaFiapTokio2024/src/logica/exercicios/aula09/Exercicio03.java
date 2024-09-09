package logica.exercicios.aula09;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int n = scanner.nextInt();
		double[] numeros = new double[n];
		
		for (int i = 0; i < n; i++) {
			numeros[i] = random.nextDouble();
		}
		
		for (double d : numeros) {
			System.out.println(d);
		}
	}

}
