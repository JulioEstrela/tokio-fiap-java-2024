package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		// TODO se for terça feira
		// calendar.get(Calendar.DAY_OF_WEEK) retorna o dia errado?
		if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.get(Calendar.THURSDAY)) {
			System.out.println("Hoje tem feira de rua");
		}
	}
}
