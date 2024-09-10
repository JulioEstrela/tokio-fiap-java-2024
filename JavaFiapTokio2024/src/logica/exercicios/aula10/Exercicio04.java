package logica.exercicios.aula10;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println(calcularOperacao(5, 6, '*'));
	}

	static double calcularOperacao(int a, int b, char operacao) {
		switch (operacao) {
			case '+': 
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return (double) a / b;
			default:
				System.out.println("Operacao invalida");
				return -1;
		}
	}
}
