
public class ContaBancaria {
	protected int numConta;
	protected String nomeTitular;
	protected double saldo;
	
	
	// construtor
	public ContaBancaria(int numConta, String nomeTitular, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String exibirInfo() {
		return this.numConta + " - " + this.nomeTitular + " R$ " + this.saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
