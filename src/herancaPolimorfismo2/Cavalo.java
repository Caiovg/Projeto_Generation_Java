package herancaPolimorfismo2;

public class Cavalo extends Animal implements Interface{

	public Cavalo() {
		super();
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println( super.getNome() + " - [relinchando  ...]");
	}
		
	public void correr() {
		System.out.println("Cavalo correndo ...");;
	}
}
