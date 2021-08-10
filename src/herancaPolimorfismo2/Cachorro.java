package herancaPolimorfismo2;

public class Cachorro extends Animal implements Interface{
	
	private String cor;
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public String getNome() {
		return "Cachorro com nome de " + super.getNome() + " a cor dele é " + this.getCor();
	}
	
	
	//Metodos
	public void emitirSom() {
		System.out.println(super.getNome() + " - [AU AU AU AU]");
	}
		
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

}
