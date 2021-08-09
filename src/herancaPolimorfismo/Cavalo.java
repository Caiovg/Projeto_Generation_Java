package herancaPolimorfismo;

public class Cavalo extends Animal{

	public Cavalo() {
		super();
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println("Cavalo - [relinchando  ...]");
	}
		
	public void correr() {
		System.out.println("Cavalo correndo ...");;
	}
}
