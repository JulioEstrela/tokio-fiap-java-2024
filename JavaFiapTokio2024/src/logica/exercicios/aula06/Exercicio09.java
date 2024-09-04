package logica.exercicios.aula06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 - residencia");
		System.out.println("2 - comercio");
		System.out.println("3 - industria");
		System.out.print("Insira seu tipo de cliente: ");
		
		/*
		Map<Integer, Double> tipoClienteValor = new HashMap<Integer, Double>();
		tipoClienteValor.put(1, 0.6);
		tipoClienteValor.put(2, 0.48);
		tipoClienteValor.put(3, 1.29);
		*/
		
		
		int tipoCliente = scanner.nextInt();
		double valor = 0;
		switch (tipoCliente) {
		case 1:
			valor = 0.6;
			break;
		case 2:
			valor = 0.48;
			break;
		case 3:
			valor = 1.29;
			break;
		}
		
		System.out.print("Insira a quantidade de kWh utilizados: ");
		int consumoHoras = scanner.nextInt();
		
		//System.out.println("Valor total da conta: " + tipoClienteValor.get(tipoCliente) * consumoHoras);
		System.out.println("Valor total da conta: " + valor * consumoHoras);
	}

}
