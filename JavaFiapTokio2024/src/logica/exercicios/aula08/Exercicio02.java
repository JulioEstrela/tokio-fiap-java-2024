package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.get(Calendar.TUESDAY)) {
			System.out.println("Hoje tem feira de rua");
		} else {
			System.out.println("Hoje nao tem feira de rua");
		}
	}
}
