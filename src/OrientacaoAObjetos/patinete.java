package OrientacaoAObjetos;

public class patinete {

	//Atributos
	private String nome;
	private String cor;
	private String marca;
	private double tamanho;
	private double valor;
	
	//Metodo Construtor sem parametros
	public patinete() {
		super();
	}
	
	//Metodo Construtor com parametros
	public patinete(String nome, String cor, String marca, double tamanho, double valor) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.marca = marca;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	//Metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Produto Eletronico [nome= " + nome + ", cor= " + cor + ", marca= " + marca + ", tamanho= " + tamanho + ", valor= " + valor +"]";
	}

}
