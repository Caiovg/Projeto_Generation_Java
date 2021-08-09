package herancaPolimorfismo;

public class Preguica extends Animal{

	public Preguica() {
		super();
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	//Metodos
	public void emitirSom() {
		System.out.println("Pregui�a - [AAAAAA ...]");
	}
	
	public void subirArvore() {
		System.out.println("Pregui�a subindo na arvore ...");;
	}
}
