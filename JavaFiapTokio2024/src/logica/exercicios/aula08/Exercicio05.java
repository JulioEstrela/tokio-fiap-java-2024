package logica.exercicios.aula08;

import java.util.Random;

public class Exercicio05 {
	public static void main(String[] args) {
		int soma = 0;
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			soma += random.nextInt(5, 50);
		}
		
		System.out.println("Soma: " + soma);
	}
}
