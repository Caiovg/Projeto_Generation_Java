package OrientacaoAObjetos;

public class produtoEletronico {
	
	//Atributos
	private String nome;
	private double valor;
	private int qtd;
	
	//Metodo Construtor sem parametros
	public produtoEletronico() {
		super();
	}

	//Metodo Construtor com parametros
	public produtoEletronico(String nome, double valor, int qtd) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}

	//Metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Produto Eletronico [nome= " + nome + ", valor= " + valor + ", quantidade= " + qtd +"]";
	}
}
