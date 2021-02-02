
public class Banco {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(10011, "Isidro", 1000);
		
		//c1.setNumConta(10011);
		//c1.setNomeTitular("Isidro");
		//c1.creditar(1000);
		
		System.out.println(c1.exibirInfo());
		
		ContaEspecial c2 = new ContaEspecial(10022, "Jose", 200, 500);
		
		//c2.setNumConta(10022);
		//c2.setNomeTitular("Jose");
		//c2.creditar(2000);
		//c2.setLimite(500.0);
		
		System.out.println(c2.exibirInfo());
	}
}
