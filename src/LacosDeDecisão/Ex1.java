package LacosDeDecis�o;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int num1, num2, num3, maior=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o 1� numero: ");
		num1 = entrada.nextInt();
		System.out.println("Informe o 2� numero: ");
		num2 = entrada.nextInt();
		System.out.println("Informe o 3� numero: ");
		num3 = entrada.nextInt();
		
		if(num1 > maior) { maior = num1; }
		if(num2 > maior) { maior = num2; }
		if(num3 > maior) { maior = num3; }
		
		System.out.print("O maior numero � " + maior);
	}
}
