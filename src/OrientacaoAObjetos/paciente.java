package OrientacaoAObjetos;

public class paciente {

	//Atributos
	private String nome;
	private String telefone;
	private String sexo;
	
	//Metodo Construtor sem parametros
	public paciente() {
		super();
	}
	
	//Metodo Construtor com parametros
	public paciente(String nome, String telefone, String sexo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
	//Metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Funcionario [nome= " + nome + ", telefone= "+ telefone + ", sexo=" + sexo + "]";
	}

}
