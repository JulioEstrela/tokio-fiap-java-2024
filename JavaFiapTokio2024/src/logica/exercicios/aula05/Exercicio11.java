package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dias = scanner.nextInt();
		int anos = dias / 365;
		int meses = (dias - (anos * 365)) / 30;
		dias = dias - (anos * 365) - (meses * 30);
		
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
	}

}
