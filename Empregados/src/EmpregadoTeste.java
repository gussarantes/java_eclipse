
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1;
		Empregado e2;
		double aumento;
		
		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.nome = "Nome Empregado 1";
		e1.cargo = "Cargo 1";
		e1.salario = 10000.00;
		
		e2.nome = "Nome Empregado 2";
		e2.cargo = "Cargo 2";
		e2.salario = 5000.00;
		
		e1.imprimir();
		System.out.println("Salario antigo: R$ " + e1.salario);
		aumento = 10.00;
		System.out.println("Aumento: " + aumento + "%");
		e1.salario = e1.aumentarSalario(aumento);
		System.out.println("Salario novo: R$ " + e1.salario);
	}
}
