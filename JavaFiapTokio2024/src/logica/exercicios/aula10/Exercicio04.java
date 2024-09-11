package logica.exercicios.aula10;

public class Exercicio04 {

	public static void main(String[] args) {
		calcularExibirOperacao(5, 6, '*');
	}

	static void calcularExibirOperacao(int a, int b, char operacao) {
		switch (operacao) {
			case '+': 
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.printf("%.2f\n", (double) a / b);
				break;
			default:
				System.out.println("Operacao invalida");
				return;
		}
	}
}
