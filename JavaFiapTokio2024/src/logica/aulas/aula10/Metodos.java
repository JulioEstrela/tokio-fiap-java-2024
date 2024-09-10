package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	static void saudacao() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Seja bem-vindo, " + nome);
	}
	
	public static void main(String[] args) {
		saudacao();
	}
}
