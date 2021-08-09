package herancaPolimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	//Metodos
	public void emitirSom() {
		System.out.println("Cachorro - [AU AU AU AU]");
	}
		
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

}
