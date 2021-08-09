package herancaPolimorfismo;

public class Animal {

	protected String nome;
	protected int idade;
	
	public Animal() {
		super();
	}
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Metodos
	public void emitirSom() {
		System.out.println("AU AU AU AU");
	}
}
