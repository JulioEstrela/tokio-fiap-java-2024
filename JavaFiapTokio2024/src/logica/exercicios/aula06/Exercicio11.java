package logica.exercicios.aula06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigoEstado = scanner.nextInt();
		double toneladasCarga = scanner.nextDouble();
		int codigoCarga = scanner.nextInt();
		double precoPorQuilo;
		
		Map<Integer, Double> codigoEstadoImposto = new HashMap<Integer, Double>();
		codigoEstadoImposto.put(1, 0.35);
		codigoEstadoImposto.put(2, 0.25);
		codigoEstadoImposto.put(3, 0.15);
		codigoEstadoImposto.put(4, 0.5);
		codigoEstadoImposto.put(5, 0.0);
		
		if (codigoCarga <= 20) {
			precoPorQuilo = 100;
		} else if (codigoCarga <= 30) {
			precoPorQuilo = 250;
		} else {
			precoPorQuilo = 340;
		}
		
		double quilosCarga = toneladasCarga * 1000;
		double valorSemImposto = quilosCarga * precoPorQuilo;
		double valorImposto = codigoEstadoImposto.get(codigoEstado) * valorSemImposto;
		
		System.out.println("Carga do caminhao em quilos: " + quilosCarga);
		System.out.println("Preco da carga: " + valorSemImposto);
		System.out.println("Valor do imposto: " + valorImposto);
		System.out.println("Valor total: " + (valorSemImposto + valorImposto));
	}

}
