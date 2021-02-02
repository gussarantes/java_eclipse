
public class InfoConta {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		
		c1 = new ContaBancaria();
		
		c1.cpfTitular = "123.456.789-12";
		c1.nomeTitular = "Nome Completo Usuario";
		c1.numeroConta = 4321;
		c1.digitoVerif = 8;
		c1.saldo = 10000.00;
		
		c1.exibirInfo(); 
		
		c1.creditar(1000.00);
		
		System.out.println("Novo saldo: R$ " + c1.consultarSaldo());
		
		c1.debitar(5000.00);
	}
}
