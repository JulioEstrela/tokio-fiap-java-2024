package logica.exercicios.aula07;

import java.util.Scanner;

/*
Um professor quer saber quantos alunos de uma sala de 20 tiveram nota maior do
que a média. Faça um programa onde o professor informe a média da turma e as
notas de cada um dos 20 alunos e, ao final, seja exibido quantos alunos tiveram nota
superior à média e quantos tiveram nota inferior à média.
 */
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int media;
		int menor = 0;
		int maior = 0;
		int nota;
		
		System.out.println("Digite a media da turma:");
		media = scanner.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			System.out.printf("Insira a nota do aluno %d: ", i);
			nota = scanner.nextInt();
			if (nota > media) {
				maior++;
			} else if (nota < media) {
				menor++;
			}
		}
		System.out.println("Quantidade de notas maiores que a media: " + maior);
		System.out.println("Quantidade de notas menores que a media: " + menor);
	
		
	}
}
