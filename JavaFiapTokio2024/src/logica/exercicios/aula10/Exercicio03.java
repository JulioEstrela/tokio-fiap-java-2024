package logica.exercicios.aula10;

public class Exercicio03 {

	public static void main(String[] args) {
		exibirTipoVoto(18);
	}

	static void exibirTipoVoto(int idade) {
		if (idade < 16) {
			System.out.println("Voto Probibido");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else {
			System.out.println("Voto opcional");
		}
	}
}
