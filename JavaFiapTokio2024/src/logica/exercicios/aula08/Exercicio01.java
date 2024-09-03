package logica.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira seu nome:");
		String nome = scanner.nextLine();
		
		Calendar calendar = Calendar.getInstance();
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hora >= 18 || hora < 6) {
			System.out.printf("Boa noite, %s", nome);
		} else if (hora >= 12) {
			System.out.printf("Boa tarde, %s", nome);
		} else if (hora >= 6) {
			System.out.printf("Bom dia, %s", nome);
		}
	}
}
