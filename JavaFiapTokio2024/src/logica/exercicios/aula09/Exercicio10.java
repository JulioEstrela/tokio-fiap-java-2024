package logica.exercicios.aula09;

import java.util.Scanner;

// soma de matrizes
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas: ");
		final int M = scanner.nextInt();
		System.out.println("Digite o numero de colunas: ");
		final int N = scanner.nextInt();
		
		int matriz[][][] = new int[3][M][N];
		
		for (int cont = 0; cont < 2; cont++) {
			System.out.println("Valores da matriz " + (cont + 1));
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					System.out.printf("Insira o valor da celula [%d][%d]: ", i, j);
					matriz[cont][i][j] = scanner.nextInt();
					
					// somando na matriz resultado
					matriz[2][i][j] += matriz[cont][i][j];
				}
			}
		}
		
		// exibindo a matriz resultado
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matriz[2][i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
