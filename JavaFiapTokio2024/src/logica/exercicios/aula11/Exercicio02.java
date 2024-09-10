package logica.exercicios.aula11;

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.println(retornarTipoVoto(18));
	}

	static String retornarTipoVoto(int idade) {
		if (idade < 16) {
			return "Voto Probibido";
		} else if (idade >= 18 && idade <= 70) {
			return "Voto obrigatorio";
		} else {
			return "Voto opcional";
		}
	}
}
