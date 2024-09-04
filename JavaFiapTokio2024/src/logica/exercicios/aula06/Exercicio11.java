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
		
		/*
		Map<Integer, Double> codigoEstadoImposto = new HashMap<Integer, Double>();
		codigoEstadoImposto.put(1, 0.35);
		codigoEstadoImposto.put(2, 0.25);
		codigoEstadoImposto.put(3, 0.15);
		codigoEstadoImposto.put(4, 0.05);
		codigoEstadoImposto.put(5, 0.0);
		*/
		
		if (codigoCarga <= 20) {
			precoPorQuilo = 100;
		} else if (codigoCarga <= 30) {
			precoPorQuilo = 250;
		} else {
			precoPorQuilo = 340;
		}
		
		double taxaImposto = 0;
		switch (codigoEstado) {
			case 1:
				taxaImposto = 0.35;
				break;
			case 2:
				taxaImposto = 0.25;
				break;
			case 3:
				taxaImposto = 0.15;
				break;
			case 4:
				taxaImposto = 0.05;
				break;
		}
		
		double quilosCarga = toneladasCarga * 1000;
		double valorSemImposto = quilosCarga * precoPorQuilo;
		// double valorImposto = codigoEstadoImposto.get(codigoEstado) * valorSemImposto;
		double valorImposto = taxaImposto * valorSemImposto;
		
		System.out.println("Carga do caminhao em quilos: " + quilosCarga);
		System.out.println("Preco da carga: " + valorSemImposto);
		System.out.println("Valor do imposto: " + valorImposto);
		System.out.println("Valor total: " + (valorSemImposto + valorImposto));
	}

}
