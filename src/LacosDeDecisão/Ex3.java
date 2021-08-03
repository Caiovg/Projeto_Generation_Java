package LacosDeDecisão;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		if(idade < 10){
			System.out.print("Criança");
		}else{
			if(idade >= 10 && idade <= 14){
				System.out.print("Infantil");	
			}else{
				if(idade >= 15 && idade <= 17){
					System.out.print("Juvenil");	
				}else{
					if(idade >= 18 && idade <= 25){
						System.out.print("Adulto");	
					}else{
						System.out.print("Senhor(a)");
					}	
				}
			}
		}
	}
}
