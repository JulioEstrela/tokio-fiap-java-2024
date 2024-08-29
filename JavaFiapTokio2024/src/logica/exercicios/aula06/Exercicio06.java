package logica.exercicios.aula06;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anoNascimento = scanner.nextInt();
		int anoAtual = LocalDateTime.now().getYear();
		
		int idade = anoAtual - anoNascimento;
		
		if (idade < 16) {
			System.out.println("Voto Probibido");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else {
			System.out.println("Voto opcional");
		}
	}

}
