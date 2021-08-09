package OrientacaoAObjetos;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args ) {
		
		//Instanciando o objeto
		
		Cliente c = new Cliente("Caio", "@gmail.com", "555.555.555.55", "(11) 0000-0000");
		System.out.print(c.toString()+"\n");
		
		aviao a = new aviao("Cessna 150", 1, 3, 100);
		System.out.print("\n"+a.toString()+"\n");
		
		produtoEletronico pe = new produtoEletronico("Teclado", 11.50, 100);
		System.out.print("\n"+pe.toString()+"\n");
		
		funcionario f = new funcionario("Caio", "(11) 0020-0020", "Masculino", 5500);
		System.out.print("\n"+f.toString()+"\n");
		
		patinete p = new patinete("Patinete show", "Vermelho", "Casas Bahia", 1.55, 23.95);
		System.out.print("\n"+p.toString()+"\n");
		
		contaBancaria cb = new contaBancaria(00001, "Caio", 800);
		System.out.print("\n"+cb.toString()+"\n");
		
		paciente pa = new paciente("Caio", "(00) 0000-0000", "Masculino");
		System.out.print("\n"+pa.toString()+"\n");
	}
}
