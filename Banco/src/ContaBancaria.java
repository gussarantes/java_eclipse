
public class ContaBancaria {
	private String cpfTitular;
	private String nomeTitular;
	private double saldo;
	private int numeroConta;
	private int digitoVerif;
	
	public ContaBancaria() {
		System.out.println("***** acabei de criar uma conta *****");
	}
	
	
	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
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

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	void exibirInfo() {
		System.out.println("----- Relatorio de conta bancaria");
		System.out.println(" CPF Titular: " + cpfTitular);
		System.out.println(" Nome Titular: " + nomeTitular);
		System.out.println(" Conta Corrente: " + numeroConta + "-" + digitoVerif);
		System.out.println(" Saldo: R$ " + saldo +"\n");
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	boolean debitar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
