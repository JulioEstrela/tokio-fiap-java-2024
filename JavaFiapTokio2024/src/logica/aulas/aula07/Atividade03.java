package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero n");
		int n = scanner.nextInt();
		
		int i = 0;
		
		while (i < n) {
			System.out.println("Produto " + i);
			i++;
		}
	}

}
