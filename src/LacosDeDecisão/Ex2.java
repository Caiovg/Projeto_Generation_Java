package LacosDeDecis�o;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o 1� numero: ");
		n1 = entrada.nextInt();
		System.out.println("Informe o 2� numero: ");
		n2 = entrada.nextInt();
		System.out.println("Informe o 3� numero: ");
		n3 = entrada.nextInt();
		
		if (n3 > n1)
		    if (n1 > n2)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
		    else if (n2 < n3)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
		  if (n1 > n2)
		    if (n2 > n3)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
		    else if (n3 < n1)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
		  if (n1 < n2)
		    if (n3 < n1)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
		    else if (n3 < n2)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	}
}
