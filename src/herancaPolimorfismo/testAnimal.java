package herancaPolimorfismo;

public class testAnimal {

	public static void main(String[] args) {
		Animal cavalo = new Cavalo("Cavalo", 34);
		cavalo.emitirSom();
		Animal cachorro = new Cachorro("Cachorroo", 3);
		cachorro.emitirSom();
		Animal preguica = new Preguica("Preguiça",5);
		preguica.emitirSom();
	}

}
