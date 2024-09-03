package logica.aulas.aula06;

public class VotoOpcional {

	public static void main(String[] args) {
		int idade = 15;
		
		boolean verificaMenorLimite = idade >= 16 && idade < 18;
		System.out.println("Voto opcional menor idade: " +  verificaMenorLimite);
		
		boolean verificaMaiorLimite = idade > 70;
		System.out.println("Voto opcional maior idade: " + verificaMaiorLimite);
		
		// verificacao 1
		if (verificaMenorLimite || verificaMaiorLimite) {
			System.out.println("Voto opcional");
		}
		// verificacao 2
		if ((idade >= 18 && idade < 18) || idade > 70) {
			System.out.println("Voto opcional");
		}
	}

}
