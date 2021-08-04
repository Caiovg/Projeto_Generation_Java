package lacosDeRepeticao;

import java.util.Scanner;

public class Ex5 {

	/*
	 * 5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	 * No final, mostre a soma dos números digitados.(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		int num, soma=0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			soma += num;
		}while(num !=0);
		
		System.out.printf("\nSoma = %d", soma);

	}

}
