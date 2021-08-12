package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		//Armazenando
		ArrayList<Produto> produto = new ArrayList<Produto>(); 
		Produto a = new Produto(1,"Teclado","Teclado gamer",12.55,20);
		Produto b = new Produto(2,"Mouse","Mouse gamer",85.50,20);
		Produto c = new Produto(3,"Tela","Tela gamer",90,20);
		Produto d = new Produto(4,"CPU","CPU gamer",1020.75,20);
		produto.add(a);
		produto.add(b);
		produto.add(c);
		produto.add(d);
		
		 for(Produto p : produto) {
			System.out.println(p); 
		 }
		 
		 
		// Removendo
		 for(int i = 0; i < produto.size(); i++) {
			 Produto p = produto.get(i);
			 
			 if(p.getNome().equals("Teclado")) {
				 produto.remove(p);
				 break;
			 }
		 }
	
		 System.out.print("\nProdutos cadastrados após remoção:\n");
		 for(Produto p : produto) {
				System.out.println(p); 
		 }
		 
		 //Atualizando
		 System.out.print("\n");
		 Map<String, Produto> pro = new TreeMap<String, Produto>();
		 
		 pro.put("Teclado",a);
		 pro.put("Mouse",b);
		 pro.put("Tela",c);
		 pro.put("CPU",d);
		 
		 System.out.println(pro);
		 System.out.println(pro.get("CPU"));
		 
		 Collection<Produto> p = pro.values();
		 for(Produto e:p) {
			 System.out.println(p);
		 }
	}

}
