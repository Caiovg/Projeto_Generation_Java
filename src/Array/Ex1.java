package Array;

import java.util.Scanner;

public class Ex1 {

	/*
	 * 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont, soma = 0;
		int[] A = new int[6];
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<6; i++){
			System.out.println("Digite os numeros inteiros para o array A["+i+"]: ");
			A[i] = entrada.nextInt();
			
			soma = A[0] + A[1] + A[5];
			A[4]=100;
		}
		
		System.out.printf("A soma do conteudo das posi��es [0][1][5] = %d", soma);
		for(int i=0; i<6; i++) {
			System.out.print("\nA["+i+"] = " + A[i]);
		}
		
	}

}
