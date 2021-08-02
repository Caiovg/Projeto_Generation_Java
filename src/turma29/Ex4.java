package turma29;

import java.util.Scanner;
import java.lang.Math;

public class Ex4 {

	public static void main(String[] args) {
		
		/*
		 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
			D = R + S / 2,	onde R = (A + B)**2 é S = (B + C)**2   
		*/
		
		/*
		 * Para você que não conhece a biblioteca Math realiza operações matematicas
		 */
		
		double A, B, C, R, S, D;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		A = entrada.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = entrada.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = entrada.nextDouble();
		
		/*
		 * Um exmplo das funcionalidades da biblioteca Math e o pow que
		 * retorna o valor x elevado à potência y.
		 */
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = ((R + S) / 2);
		System.out.println("O Resultado da sua expresão é " + D);
	}
}
