package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {
		char tabuleiro[][] = new char[3][3];

		tabuleiro[0][0] = 'X';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		int[][] matriz = new int[4][5];
		
		int linhas = matriz.length;
		System.out.println(linhas);
		
		int colunas = matriz[0].length;
		System.out.println(colunas);
		
//		matriz[0][0] = 1;
//		matriz[0][1] = 2;
//		matriz[0][2] = 3;
//		matriz[0][3] = 4;
//		matriz[0][4] = 5;
//		
//		matriz[1][0] = 6;
//		matriz[1][1] = 7;
//		matriz[1][2] = 8;
//		matriz[1][3] = 9;
//		matriz[1][4] = 10;
		
		System.out.println();
		int numero = 1;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero++;
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
