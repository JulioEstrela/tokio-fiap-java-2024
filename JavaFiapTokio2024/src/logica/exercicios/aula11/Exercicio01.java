package logica.exercicios.aula11;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.printf("Area do terreno de dimensoes %.2f x %.2f = %.2f", 2f, 5f, calcularArea(2, 5));
	}

	static double calcularArea(double largura, double comprimento) {
		return largura * comprimento;
	}
}
