package logica.exercicios.aula10;

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.printf("Area do terreno de dimensoes %.2f x %.2f = %.2f", 2f, 5f, calcularArea(2, 5));
	}

	static double calcularArea(int largura, int comprimento) {
		return largura * comprimento;
	}
}
