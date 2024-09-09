package logica.exercicios.aula09;

public class Exercicio05 {

	public static void main(String[] args) {
		String meses[] = {
				"Jan",
				"Fev",
				"Mar",
				"Abr",
				"Maio",
				"Jun",
				"Jul",
				"Ago",
				"Set",
				"Out",
				"Nov",
				"Dez"
		};
		
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < 12; i++) {
			System.out.printf("O mes de %s tem %d dias ao todo.\n", meses[i], dias[i]);
		}
	}

}
