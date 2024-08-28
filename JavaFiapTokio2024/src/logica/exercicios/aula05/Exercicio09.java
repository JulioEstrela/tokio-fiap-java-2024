package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {
	// Obs.: considere que o usuário irá digitar números somente até 999.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		// divisao entre inteiros retorna um inteiro (o número é truncado)
		int centena = (numero / 100) * 100;
		int dezena = ((numero - centena) / 10) * 10;
		int unidade = numero - centena - dezena;
		
		System.out.printf("Centena = %d\n", centena);
		System.out.printf("Dezena = %d\n", dezena);
		System.out.printf("Unidade = %d\n", unidade);
	}

}
