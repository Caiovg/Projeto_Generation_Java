package LacosDeDecisão;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		float n;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n = entrada.nextFloat();
		
		if(n % 2 == 0) {
			System.out.print("O numero digitado foi " + n + ", ele um numero par.");
			System.out.print("\nA raiz quadrada do seu numero é " + Math.sqrt(n));
		}else {
			System.out.print("O numero digitado foi " + n + ", ele um numero impar.");
			System.out.print("\nO seu numero elevado ao quadrado é " + Math.pow(n, 2));
		}
	}
}
