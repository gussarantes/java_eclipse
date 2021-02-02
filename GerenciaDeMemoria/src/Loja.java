
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		
		p1 = new Produto(1, "Computador", 2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; //pergunta: dupliquei a área da memória?
		
		// simulação? vou alterar o preco do produto p2
		// de 2000 para 2500
		
		//situacao, se efetivamente, ao atribuir pp2=p1 nós duplicassemos a área de memória,
		// eu alteraria o produto p2 e o produto p1 ficaria intacto
		
		p2.setPreco(2500);
		
		System.out.println("-------- após a alteração do preço de p2");
		System.out.println("p1 = " + p1.exibirInfo());
		System.out.println("p2 = " + p2.exibirInfo());
		
		
		
	}

}
