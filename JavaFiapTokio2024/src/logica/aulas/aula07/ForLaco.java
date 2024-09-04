package logica.aulas.aula07;

public class ForLaco {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int cont = 0;
		
		for (int i = 0; i < 500; i += 2) {
			cont += 1;
		}
		System.out.println(cont);
	}

}
