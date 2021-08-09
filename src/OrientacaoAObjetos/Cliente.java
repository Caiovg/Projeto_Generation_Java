package OrientacaoAObjetos;

public class Cliente {

	//Atributos
	private String nome;
	private String email;
	private String cpf;
	private String telefone;

	//Metodo Construtor sem parametros
	public Cliente() {
		super();
	}
	
	//Metodo Construtor com parametros
	public Cliente(String nome, String email, String cpf, String telefone) {
		super();
		this.nome = "Caio";
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//Metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Cliente [nome= " + nome + ", email= " + email + ", cpf= " + cpf + ", telefone= " + telefone +"]";
	}
}
