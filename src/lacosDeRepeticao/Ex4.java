package lacosDeRepeticao;

import java.util.Scanner;

public class Ex4 {

	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas;
		o número de mulheres nervosas;
		o número de homens agressivos;
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos;
		o número de pessoas calmas com menos de 18 anos.
	*/
	public static void main(String[] args) {
		
		int pessoas=0, pessoasCalmas = 0, outrosCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, pessoasNervosas40 = 0, pessasCalmas18 = 0, sexo, caracteristica, idade;
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("###############################################");
		while(pessoas != 2) {
			System.out.println("###############################################");
			System.out.println("Informe seu nome: ");
			nome = entrada.next();
			System.out.println("Okay, " + nome + " agora informe sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Informe o seu sexo (1)-Feminino, (2)-Masculino, (3)-Outros: ");
			sexo = entrada.nextInt();
			System.out.println("Informe o sua caracteristica (1)-pessoa calma; (2)-pessoa nervosa; (3)-pessoa agressiva: ");
			caracteristica = entrada.nextInt();
			
			if(caracteristica == 1) { pessoasCalmas++; }
			if(caracteristica == 2 && sexo == 1) { mulheresNervosas++; }
			if(caracteristica == 3 && sexo == 2) { homensAgressivos++; }
			if(caracteristica == 1 && sexo == 3) { outrosCalmas++; }
			if(caracteristica == 2 && idade >= 40) { pessoasNervosas40++; }
			if(caracteristica == 2 && idade <= 10) { pessasCalmas18++; }
			
			pessoas++;
		}
		System.out.printf("\n!!!Programa Finalizado!!!\n");
		System.out.printf("\nTotal de pessoas calmas: %d", pessoasCalmas);
		System.out.printf("\nTotal de mulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\nTotal de homens agressivos: %d", homensAgressivos);
		System.out.printf("\nTotal de outros calmos: %d", outrosCalmas);
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d", pessoasNervosas40);
		System.out.printf("\nTotal de pessoas calmas com menos de 18 anos: %d", pessasCalmas18);
	}

}
