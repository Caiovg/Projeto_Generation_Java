package turma29;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
			5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
			Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente	
		*/
		
		double nota1, nota2, nota3, media, peso1=2.0, peso2=3.0, peso3=5.0;
		String nomeAluno;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Caro aluno, digite o seu nome: ");
		nomeAluno = entrada.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		media = ((nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3));
		System.out.println(nomeAluno + " sua media final � " + media);
	}
}
