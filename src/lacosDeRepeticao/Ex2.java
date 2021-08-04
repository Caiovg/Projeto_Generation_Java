package lacosDeRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		int par=0, num, impar=0;
		Scanner entrada = new Scanner(System.in);
		for (int i=1; i<=10; i++) { 
			System.out.println("Informe numero: ");
			num = entrada.nextInt();
			if (num%2==0){ 
				par++;
			}else {
				impar++;
			}
		}

		System.out.printf("Pares: %d\n", par);

		System.out.printf("Impares: %d", impar);

	}

}
