package Array;

import java.util.Scanner;

public class Ex4 {

	/*
	 * 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
	(1) somar as duas matrizes 
	(2) subtrair a primeira matriz da segunda 
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes 
	 Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
	 Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante 
	 deve ser armazenado na pr�pria matriz.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc, constante;
		double[][] matriz = new double[2][2];
		double[][] matriz1 = new double[2][2];
		double[][] matrizSoma = new double[2][2];
		double[][] matrizSubtrair = new double[2][2];
		boolean sair = false;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n1� Matriz");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor da matriz linha-["+i+"], coluna-["+j+"]:");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("\n2� Matriz");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor da matriz linha-["+i+"], coluna-["+j+"]:");
				matriz1[i][j] = entrada.nextInt();
			}
		}
		
		//Soma
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				matrizSoma[i][j] = matriz[i][j] + matriz1[i][j];
			}
		}
		
		//Subtrair
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				matrizSubtrair[i][j] = matriz[i][j] - matriz1[i][j];
			}
		}
		
		while(sair == false) {
			System.out.println("\nMatriz M[2][2]");
			System.out.println("\nDigite uma das op��es a seguir.");
			System.out.println("\n 1 - Somar as duas matrizes. \n 2 - Subtrair a primeira matriz da segunda. \n"+ 
					" 3 - Adicionar uma constante as duas matrizes. \n"+
					" 4 - Imprimir as matrizes. \n"+
					" 5 - Finalizar o programa. \n"+
					" Qual e sua escolha: ");
			opc = entrada.nextInt();
			switch(opc) {
				case 1:
					System.out.println("\nSoma das duas matrizes\n");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							System.out.print("["+matrizSoma[i][j]+"]");
						}
						System.out.println("\n");
					}
					break;
				case 2:
					System.out.println("\nSubtra��o das duas matrizes\n");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							System.out.print("["+matrizSubtrair[i][j]+"]");
						}
						System.out.println("\n");
					}
					break;
				case 3:
					System.out.println("\nEntre com valor da constante: ");
					constante = entrada.nextInt();
					//Matriz1
					System.out.println("\n1� Matriz");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							matriz[i][j] = matriz[i][j] + constante;
							System.out.print("["+matriz[i][j]+"]");
						}
						System.out.println("\n");
					}
					System.out.println("\n2� Matriz");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							matriz1[i][j] = matriz1[i][j] + constante;
							System.out.print("["+matriz1[i][j]+"]");
						}
						System.out.println("\n");
					}
					break;
				case 4:
					System.out.println("\n1� Matriz");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							System.out.print("["+matriz[i][j]+"]");
						}
						System.out.println("\n");
					}
					System.out.println("\n2� Matriz");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {
							System.out.print("["+matriz1[i][j]+"]");
						}
						System.out.println("\n");
					}
					break;
				case 5:
					System.out.println("\nPrograma finalizado!!!\n");
					sair = true;
					break;
				default:
					System.out.println("\nOp��o invalida\n");
			}
		}
	}

}
