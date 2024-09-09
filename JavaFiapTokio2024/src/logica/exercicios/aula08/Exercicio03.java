package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		
		int maiusculos = 0;
		int minusculos = 0;
		int numericos = 0;
		int espacos = 0;
				
		for (Character c : texto.toCharArray()) {
			if (c >= '0' && c <= '9') {
				numericos++;
			} else if (c == ' ') {
				espacos++;
			} else if (c >= 'A' && c <= 'Z') {
				maiusculos++;
			} else if (c >= 'a' && c <= 'z') {
				minusculos++;
			}
		}
		
		System.out.println("Quantidade de caracteres maiusculos: " + maiusculos);
		System.out.println("Quantidade de caracteres minusculos: " + minusculos);
		System.out.println("Quantidade de caracteres numericos: " + numericos);
		System.out.println("Quantidade de caracteres espacos em branco: " + espacos);
	}
}
