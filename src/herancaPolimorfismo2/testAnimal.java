package herancaPolimorfismo2;

public class testAnimal {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Cavalo", 34);
		cavalo.emitirSom();
		Cachorro cachorro = new Cachorro("Cachorro", 3);
		cachorro.emitirSom();
		Preguica preguica = new Preguica("Preguiça",5);
		preguica.emitirSom();
	}

}
