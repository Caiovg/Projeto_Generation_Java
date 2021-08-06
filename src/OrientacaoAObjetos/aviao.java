package OrientacaoAObjetos;

public class aviao {

	//Atributos
	private String modelo;
	private int quantidade_turbinas;
	private int capacidade_passageiros;
	private double capacidade_carga;
	
	//Metodo Construtor sem parametros
	public aviao() {
		super();
	}

	//Metodo Construtor com parametros
	public aviao(String modelo, int quantidade_turbinas, int capacidade_passageiros, double capacidade_carga) {
		super();
		this.modelo = modelo;
		this.quantidade_turbinas = quantidade_turbinas;
		this.capacidade_passageiros = capacidade_passageiros;
		this.capacidade_carga = capacidade_carga;
	}

	//Metodos get e set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade_turbinas() {
		return quantidade_turbinas;
	}

	public void setQuantidade_turbinas(int quantidade_turbinas) {
		this.quantidade_turbinas = quantidade_turbinas;
	}

	public int getCapacidade_passageiros() {
		return capacidade_passageiros;
	}

	public void setCapacidade_passageiros(int capacidade_passageiros) {
		this.capacidade_passageiros = capacidade_passageiros;
	}

	public double getCapacidade_carga() {
		return capacidade_carga;
	}

	public void setCapacidade_carga(double capacidade_carga) {
		this.capacidade_carga = capacidade_carga;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Avião [modelo= " + modelo + ", quantidade de turbinas= " + quantidade_turbinas + ", capacidade de passageiros= " + capacidade_passageiros + ", capacidade de carga= " + capacidade_carga +"]";
	}
}
