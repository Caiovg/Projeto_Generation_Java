package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

	/*
	 * 2- Faça um programa que receba 6 números inteiros e mostre: 
		Os números pares digitados;  
	    A soma dos números pares digitados; 
		Os números ímpares digitados; 
	    A quantidade de números ímpares digitados.
	 */
	
	public static void main(String[] args) {
		
			List<Integer> numerosImpares = new ArrayList<>();
	       List<Integer> numerosPares = new ArrayList<>();
	       int numero, somaPar = 0;
	       Scanner entrada = new Scanner(System.in);
	       for (int i = 0; i < 6; i++) {
	    	   System.out.println("Digite o "+(i+1)+"º numero: ");
		       numero = entrada.nextInt();
	           if (numero % 2 == 0){
	               numerosPares.add(numero);
	               somaPar += numero;
	           }else{
	               numerosImpares.add(numero);
	           }
	       }
	       System.out.println("Números pares digitados: " + numerosPares);
	       System.out.println("Soma dos números pares: " + somaPar);
	       System.out.println("Números ímpares digitados: " + numerosImpares);
	       System.out.println("Quantidade de ímpares digitados: " + numerosImpares.size());   
	}
}
