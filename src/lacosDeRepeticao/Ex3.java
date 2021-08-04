package lacosDeRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		
		Scanner entrada = new Scanner(System.in);
		int idade, cont21=0, cont50=0;
		
		System.out.println("Digite sua Idade: ");
		idade = entrada.nextInt();
		System.out.println("PARA ENCERRAR O PROGRAMA DIGITE -99");
		while(idade != -99) {
			if(idade<21) {cont21++;}
			if(idade>50) {cont50++;}
			System.out.println("Digite sua Idade: ");
			idade = entrada.nextInt();
		}
		System.out.printf("\n O total de pessoas com menos de 21 anos e: %d",cont21);
		System.out.printf("\n O total de pessoas com mais de 50 anos e: %d",cont50);
	}
}
