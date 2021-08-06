package OrientacaoAObjetos;

public class funcionario {

	//Atributos
	private String nome;
	private String telefone;
	private String sexo;
	private double salario;
	
	//Metodo Construtor sem parametros
	public funcionario() {
		super();
	}
	
	//Metodo Construtor com parametros
	public funcionario(String nome, String telefone, String sexo, double salario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Funcionario [nome= " + nome + ", telefone= "+ telefone + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
}
