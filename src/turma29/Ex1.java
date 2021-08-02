package turma29;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	
		/*Exercicio
			
			1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
			meses e dias e mostre-a expressa apenas em dias.
		*/
		
		int dias, meses, anos;
		Scanner entrada = new Scanner(System.in);
			
	
		System.out.println("Informe sua idade.");
		System.out.println("\nAnos: ");
		anos = entrada.nextInt();
		System.out.println("\nMeses: ");
		meses = entrada.nextInt();
		System.out.println("\nDias: ");
		dias = entrada.nextInt();
		
		dias += (anos * 365) + (meses * 30);
		System.out.println("\nA sua idade em dias é " + dias);
	}
}
