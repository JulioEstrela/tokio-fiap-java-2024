package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anos = scanner.nextInt();
		int meses = scanner.nextInt();
		int dias = scanner.nextInt();
		
		dias = anos * 365 + meses * 30 + dias;
		System.out.println(dias);
	}

}
