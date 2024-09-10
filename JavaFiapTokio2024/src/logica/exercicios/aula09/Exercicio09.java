package logica.exercicios.aula09;

import java.util.Random;

public class Exercicio09 {

	public static void main(String[] args) {
		final int M = 3;
		final int N = 4;
		int matriz[][] = new int[M][N];
		
		Random random = new Random();
		
		// Atribua valores aleatórios à todas posições da matriz.
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = random.nextInt();
			}
		}
		
		// Exiba essa matriz.
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
