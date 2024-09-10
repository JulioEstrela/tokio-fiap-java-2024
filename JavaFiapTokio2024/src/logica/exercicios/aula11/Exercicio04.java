package logica.exercicios.aula11;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println(converterTemperatura(20, 'c', 'f'));
	}

	// A função deve retornar a temperatura nas 3 escalas
	static double converterTemperatura(double temperaturaOriginal, Character escala, Character escalaRetorno) {
		double c, f, k;
		switch (Character.toUpperCase(escala)) {
			case 'C':
				c = temperaturaOriginal;
				f = (c * 9/5) + 32;
				k = c + 273.15;
				break;
			case 'F':
				f = temperaturaOriginal;
				c = (f - 32) * 5/9;
				k = c + 273.15;
				break;
			case 'K':
				k = temperaturaOriginal;
				c = k - 273.15;
				f = (c * 9/5) + 32;
				break;
			default:
				System.out.println("ERRO: Escala nao encontrada");
				return -1;
		}
		switch (Character.toUpperCase(escalaRetorno)) {
			case 'C':
				return c;
			case 'F':
				return f;
			case 'K':
				return k;
			default:
				System.out.println("ERRO: Escala de retorno nao encontrada");
				return -1;
			}
	}
}
