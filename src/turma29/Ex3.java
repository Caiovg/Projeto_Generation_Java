package turma29;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/* 
			3. Faça um sistema que leia o tempo de duração de um evento em uma 
			fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos
		 */
		
		int horas, minutos, segundos, seg;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tempo de duração de um evento expressa em segundos: ");
		segundos = entrada.nextInt();
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		seg = ((segundos % 3600) % 60);
		System.out.print("A duração do evento foi de " + horas + ":" + minutos + ":" + seg);
		
	}
}
