package turma29;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		/*
		 7. Um sistema de equações lineares do tipo: ax+by=c e dx+ey=f,
		 pode ser resolvido segundo mostrado abaixo:X=ce-bf/ae-bd y=af-cd/ae-bd.
		 Escreva um algoritmo que lê os coeficientes a,b,c,d,e é f é calcula e mostre valores X e Y.
		*/
		
		double a,b,c,d,e,f,X,Y;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente de a: ");
		a = entrada.nextDouble();
		System.out.println("Digite o coeficiente de b: ");
		b = entrada.nextDouble();
		System.out.println("Digite o coeficiente de c: ");
		c = entrada.nextDouble();
		System.out.println("Digite o coeficiente de d: ");
		d = entrada.nextDouble();
		System.out.println("Digite o coeficiente de e: ");
		e = entrada.nextDouble();
		System.out.println("Digite o coeficiente de f: ");
		f = entrada.nextDouble();
	
		
		X = (((c*e)-(b*f))/((a*e)-(b*d)));
		Y = (((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.print("Os valores de X e Y são respectivamente: " + "X = " + X + ", Y = " + Y);
	}

}
