package logica.exercicios.aula05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valorReais = scanner.nextDouble();
		
		Map<String, Double> tabelaConversao = new HashMap<String, Double>();
		tabelaConversao.put("euros", 0.16);
		tabelaConversao.put("dolares", 0.18);
		tabelaConversao.put("pesos", 172.21);
		tabelaConversao.put("libras", 0.14);
		tabelaConversao.put("ienes", 26.17);
		
		System.out.printf("%.2f reais equivalem a:\n", valorReais);
		for (Map.Entry<String, Double> entry : tabelaConversao.entrySet()) {
			System.out.printf("%.2f %s\n", entry.getValue() * valorReais, entry.getKey());
		}
	}

}
