package logica.exercicios.aula08;

import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {
		Random random = new Random();
		int pares = 0;
		int impares = 0;
		int primos = 0;
		
		for (int i = 0; i < 100; i++) {
			int num = random.nextInt(0, 101);
			
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			if (isPrime(num)) {
				primos++;
			}
		}
		System.out.println("Quantidade pares: " + pares);
		System.out.println("Quantidade impares: " + impares);
		System.out.println("Quantidade primos: " + primos);
	}
	
	public static boolean isPrime(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
