package turma29;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
			2. Faça um sistema que leia a idade de uma pessoa expressa em dias
			e mostre-a expressa em anos, meses e dias.
		*/
		
		int dias_idade, dias, meses, anos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa a sua idade em dias: ");
		dias_idade = entrada.nextInt();
		
		anos = (dias_idade / 365);
		meses = (dias_idade % 365) / 30;
		dias = (dias_idade % 365) % 30;
		
		System.out.print("A idade em anos, meses e dias são: " + anos + " Anos, "+ meses + " Meses, "+ dias + " Dias.");
	}
}
