package OrientacaoAObjetos;

public class contaBancaria {

	//Atributos
	private int numeroConta;
	private String titular;
	private double saldo;
	
	//Metodo Construtor sem parametros
	public contaBancaria() {
		super();
	}
	
	//Metodo Construtor com parametros
	public contaBancaria(int numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	//Metodos get e set
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Conta Bancaria [numero da conta= " + numeroConta + ", titular= "+ titular + ", saldo=" + saldo + "]";
	}
}
