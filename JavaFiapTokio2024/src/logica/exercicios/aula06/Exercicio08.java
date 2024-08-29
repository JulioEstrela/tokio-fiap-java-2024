package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distancia = scanner.nextDouble();
		double combustivelGastoLitros = scanner.nextDouble();
		
		double consumoMedio = distancia / combustivelGastoLitros;
		
		System.out.println(consumoMedio);
		
		if (consumoMedio < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia Legal");
		}
	}

}
