package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	static void saudacaoComArgs(String nome) {
		System.out.println("Seja bem-vindo(a), " + nome);
	}
	
	static void exibirSoma(int n1, int n2) {
		System.out.println("Soma: " + (n1 + n2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nomeDigitado = scanner.nextLine();
		
		saudacaoComArgs(nomeDigitado);
		exibirSoma(2, 3);
	}

}
