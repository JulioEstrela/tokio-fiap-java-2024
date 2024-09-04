package logica.exercicios.aula06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira os tres lados do triangulo:");
		double ladoA, ladoB, ladoC;
		ladoA = scanner.nextDouble();
		ladoB = scanner.nextDouble();
		ladoC = scanner.nextDouble();
		
		/*
		List<Double> lados = Arrays.asList(ladoA, ladoB, ladoC);
		Collections.sort(lados);
		ladoA = lados.get(2);
		ladoB = lados.get(1);
		ladoC = lados.get(0);
		*/
		
		// ordenar lados
		double temp;
		if (ladoA < ladoB) {
			temp = ladoA;
			ladoA = ladoB;
			ladoB = temp;
		}
		if (ladoA < ladoC) {
			temp = ladoA;
			ladoA = ladoC;
			ladoC = temp;
		}
		if (ladoB < ladoC) {
			temp = ladoB;
			ladoB = ladoC;
			ladoC = temp;
		}
		
		System.out.println(ladoA);
		System.out.println(ladoB);
		System.out.println(ladoC);
		
		// verificar tipo de triângulo
		if (ladoA >= ladoB + ladoC) {
			System.out.println("Nao forma triangulo");
		} else {
			double ladoA2 = ladoA * ladoA;
			double ladoB2 = ladoB * ladoB;
			double ladoC2 = ladoC * ladoC;
			
			if (ladoA2 == ladoA2 + ladoC2) {
				System.out.println("Triangulo Retangulo");
			}
			else if (ladoA2 > ladoB2 + ladoC2) {
				System.out.println("Triangulo Obtusangulo");
			}
			else {
				System.out.println("Triangulo Acutangulo");
			}
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.println("Triangulo Equilatero");
			} else if (ladoA != ladoB && ladoA != ladoC) {
				System.out.println("Triangulo Escaleno");
			} else {
				System.out.println("Triangulo Isoceles");
			}
		}
	}

}
