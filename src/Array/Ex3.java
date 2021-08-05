package Array;

import java.util.Scanner;

public class Ex3 {

	/*
	 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int[][] matriz = new int[3][3];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nMatriz M[3][3]\n");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite o valor da matriz linha-["+i+"], coluna-["+j+"]:");
				matriz[i][j] = entrada.nextInt();
				if(matriz[i][j] > 10) {
					cont++;
				}
			}
		}
		
		System.out.println("\nSua matriz 3x3 ficou assim.\n");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		System.out.printf("\nA quantidade de valores maiores que 10 ela possui e de %d", cont);
	}

}
