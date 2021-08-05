package lacosDeRepeticao;

import java.util.Scanner;

public class Ex6 {

	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. 
	 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		int num, soma=0;
		float media=0, cont=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			if(num%2!= 0 && num!=0) {
				soma+=num;
				cont++;
			}
		}while(num!=0);
		
		if(cont!=0) {
			media=soma/cont;
			System.out.printf("\nA media dos numeros multiplos de 3 e: %.2f", media);
		}else {
			System.out.printf("\nA media dos numeros multiplos de 3 e: %.2f", media);
		}
	}

}
