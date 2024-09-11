package logica.exercicios.aula10;

public class Exercicio02 {

	public static void main(String[] args) {
		calcularExibirArea(2f, 5f);
	}

	static void calcularExibirArea(double largura, double comprimento) {
		System.out.printf("Area do terreno de dimensoes %.2f x %.2f = %.2f", largura, comprimento, largura * comprimento);
	}
}
