package logica.aulas.aula05;

public class Operadores {
	public static void main(String[] args) {
		
		System.out.println("OPERADORES ARITIMETICOS");
		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);

		float soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("Subtracao: " + subtracao);
		
		float multiplicacao = num1 * num2;
		System.out.println("Multiplicacao: " + multiplicacao);
		
		float divisao = num1 / num2;
		System.out.println("Divisao: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto: " + resto);
		
		
		System.out.println();
		System.out.println("OPERADORES UNARIOS");
		int numero = 15;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero + 1);
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		
		System.out.println();
		System.out.println("OPERADORES DE ATRIBUICAO");
		double number = 5;
		
		System.out.println(number);
		
		number += 7;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
		
		
		System.out.println();
		System.out.println("OPERADORES RELACIONAIS");
		System.out.println(6 == 3);
		int num = 40;
		
		System.out.println(num != 14);
		System.out.println(num == 14);
		System.out.println(false);
		
		boolean arLigado = false;
		boolean comparacao = num1 > 2;
		System.out.println("Comparacao: " + comparacao);
		
		String nome1 = new String("Julio");
		String nome2 = "Julio";
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		
		
		System.out.println();
		System.out.println("OPERADORES LOGICOS");
		/*
		 * LOGICA E (&&)
		 * EMAIL	SENHA	LOGIN
		 * true		true  	true
		 * true  	false 	false
		 * false 	true  	false
		 * false 	false 	false
		 */
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		/*
		 * LOGICA OU (||)
		 * SOL NO DOMINGO	JOGO BR 	CHURRASCO NO DOMINGO
		 * true				true		true
		 * true				false		true
		 * false			true		true
		 * false			false		false
		 */
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		// OPERADOR DE NEGAÇÃO
		boolean negacao = !false;
		System.out.println(negacao);
	}
}
