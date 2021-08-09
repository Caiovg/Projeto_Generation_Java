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
		System.out.println("Preguiça - [AAAAAA ...]");
	}
	
	public void subirArvore() {
		System.out.println("Preguiça subindo na arvore ...");;
	}
}
