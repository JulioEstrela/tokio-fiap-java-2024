package logica.aulas.aula06;

public class Condicionais {

	public static void main(String[] args) {
		float notaFinal = 10;
		
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
	}

}
