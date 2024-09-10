package logica.exercicios.aula10;

public class Exercicio05 {

	public static void main(String[] args) {
		converterExibirTemperatura(20, 'c');
	}

	// A função deve exibir a temperatura nas 3 escalas
	static void converterExibirTemperatura(double temperaturaOriginal, Character escala) {
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
				return;
		}
		System.out.println("Temperatura em Celsius: " + c);
		System.out.println("Temperatura em Fahrenheit: " + f);
		System.out.println("Temperatura em Kelvin: " + k);
	}
}
