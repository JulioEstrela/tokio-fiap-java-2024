package logica.exercicios.aula07;

public class Exercicio10 {

	public static void main(String[] args) {				
		System.out.println();
		System.out.println("Numeros primos entre 2 e 2000");
		for (int i = 2; i <= 2000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	
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
