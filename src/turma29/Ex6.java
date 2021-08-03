package turma29;

import java.util.Scanner;
import java.lang.Math;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 	6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 	P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é
		*/

		double x1, x2, y1, y2, D;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de x do primeiro o ponto: ");
		x1 = entrada.nextDouble();
		System.out.println("Digite o valor de y do primeiro o ponto: ");
		y1 = entrada.nextDouble();
		System.out.println("Digite o valor de x do segundo o ponto: ");
		x2 = entrada.nextDouble();
		System.out.println("Digite o valor de y do segundo o ponto: ");
		y2 = entrada.nextDouble();
		
		D = Math.sqrt(((x2-x1) * (x2 -x1)) + ((y2-y1) * (y2-y1)));
		System.out.printf("A distancia entre eles é %.3f\n", D);
	}

}
