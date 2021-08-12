package collections;

public class Produto {

	private int codigo;
	private String nome;
	private String descricao;
	private double preco;
	private int qtdEstoque;
	
	public Produto() {
		super();
	}

	public Produto(int codigo, String nome, String descricao, double preco, int qtdEstoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public String toString() {
		return "Codigo - " + this.codigo + ", Nome - " + this.nome + ", Descrição - " + this.descricao
				+ ", Preço - " + this.preco + ", Quantidade em estoque - " + this.qtdEstoque;
	}
	
}
