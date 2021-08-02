package turma29;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		/*
			8. O custo ao consumidor de um carro novo é a soma do custo de 
			fábrica com a percentagem do distribuidor e dos impostos 
			(aplicados ao custo de fábrica). 
			Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
			escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
		*/
		
		double custo_fabrica, custo_consumidor, porcentagem_distribuidor = 28.0, porcetagem_impostos = 45.0, destribuidor, valor_impostos;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o custo de fabrica: ");
		custo_fabrica = entrada.nextDouble();
		destribuidor = (custo_fabrica * porcentagem_distribuidor) / 100;
		valor_impostos = (custo_fabrica * porcetagem_impostos) / 100;
		custo_consumidor = (destribuidor + valor_impostos);
		System.out.print("O custo ao consumidor um carro é " + custo_consumidor);
	}
}
