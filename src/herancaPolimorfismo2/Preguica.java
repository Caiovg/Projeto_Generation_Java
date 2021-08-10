package herancaPolimorfismo2;

public class Preguica extends Animal implements Interface{

	public Preguica() {
		super();
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	//Metodos
	public void emitirSom() {
		System.out.println(super.getNome() +" - [AAAAAA ...]");
	}
	
	public void subirArvore() {
		System.out.println("Preguiça subindo na arvore ...");;
	}
}
