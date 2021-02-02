
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir(){
		System.out.println("----- Relatorio empregado");
		System.out.println(" Nome: " + nome);
		System.out.println(" Cargo: " + cargo);
		System.out.println(" Salario: R$" + salario +"\n");
	}	
	
	double aumentarSalario(double percentual) {
		double novoSalario = salario + salario * percentual / 100;
		return novoSalario;	
	}
	
}
