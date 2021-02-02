
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		
		p1 = new Produto(1, "Computador", 2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; //pergunta: dupliquei a �rea da mem�ria?
		
		// simula��o? vou alterar o preco do produto p2
		// de 2000 para 2500
		
		//situacao, se efetivamente, ao atribuir pp2=p1 n�s duplicassemos a �rea de mem�ria,
		// eu alteraria o produto p2 e o produto p1 ficaria intacto
		
		p2.setPreco(2500);
		
		System.out.println("-------- ap�s a altera��o do pre�o de p2");
		System.out.println("p1 = " + p1.exibirInfo());
		System.out.println("p2 = " + p2.exibirInfo());
		
		
		
	}

}
