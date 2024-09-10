package logica.exercicios.aula09;

import java.util.Scanner;

/*
		Escreva um algoritmo que recebe uma lista de nomes e imprime os nomes na ordem
	inversa a da leitura.
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		String nomes[] = new String[0];
		
		/*
		while (scanner.hasNext()) {
			nome = scanner.nextLine();
			System.out.println(nome);
		}
		System.out.println("FIM");
		*/
		
		int i = 0;
		while (true) {
			nome = scanner.nextLine();
			// A lista termina quando o usuário aperta o Enter sem que nenhum nome tenha sido digitado.
			if (nome.equals("")) {
				break;
			}
			
			// aumentando o tamanho do array
			String tempArray[] = new String[nomes.length + 1];
			for (int j = 0; j < nomes.length; j++) {
				tempArray[j] = nomes[j];
			}
			nomes = tempArray;
			
			
			nomes[i] = nome;
			
			i++;
		}
		
		for (i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
	}

}
