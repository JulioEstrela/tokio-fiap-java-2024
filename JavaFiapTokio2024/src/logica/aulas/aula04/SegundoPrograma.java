package logica.aulas.aula04;

import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.printf("Olá, %s\n", nome);
	}
}
