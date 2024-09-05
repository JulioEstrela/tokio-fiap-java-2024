package logica.aulas.aula08;

import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("Mes: " + calendar.get(Calendar.MONTH));
		System.out.println("Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
	}

}
