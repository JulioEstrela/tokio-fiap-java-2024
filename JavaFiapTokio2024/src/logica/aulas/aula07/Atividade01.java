package logica.aulas.aula07;

import java.util.Scanner;

// Sem loop
public class Atividade01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		soma = soma + num;
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		soma = soma + num;
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		soma += num;
		
		System.out.println("O resultado é: " + soma);
	}

}
