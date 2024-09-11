package logica.exercicios.aula11.exercicio05;

final class OperacoesMatematicas {
	private OperacoesMatematicas() {}
	
	static double calcularOperacao(int a, int b, char operacao) {
		switch (operacao) {
			case '+': 
				return somar(a, b);
			case '-':
				return subtrair(a, b);
			case '*':
				return multiplicar(a, b);
			case '/':
				return dividir(a, b);
			default:
				System.out.println("Operacao invalida");
				return -1;
		}
	}
	
	static private int somar(int a, int b) {
		return a + b;
	}
	static private int subtrair(int a, int b) {
		return a - b;
	}
	static private int multiplicar(int a, int b) {
		return a * b;
	}
	static private double dividir(int a, int b) {
		return (double) a / b;
	}
}
