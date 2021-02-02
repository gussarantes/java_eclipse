
public class Loja {
	public static void main(String[] args) {
		Carro c1; //declarei uma variável c1 do tipo Carro
		Carro c2;
		
		//antes de começar a preencher os dados, preciso criar a área de memória
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Xevrolé";
		c1.modelo = "Corça";
		c1.cor = "Branco com detalhes em preto para realçar a beleza";
		c1.ano = 1997;
		c1.preco = 6999.00;
		
		c2.marca = "Porxe";
		c2.modelo = "Kaieni";
		c2.cor = "Preta";
		c2.ano = 2019;
		c2.preco = 839999.00;
		
		//exibir anúncios
		//System.out.println("----- Anuncios do isiCarros");
		//System.out.println("Carro: " + c1.marca + " " + c1.modelo);
		
		c1.exibirAnuncio();
		double ipvaC1 = c1.calcularIPVA();
		System.out.println("IPVA: " + ipvaC1);
		
		c2.exibirAnuncio();
		double ipvaC2 = c2.calcularIPVA();
		System.out.println("IPVA: " + ipvaC2);
		
		System.out.println("\nDescontos da loja");
		System.out.println(c1.marca+"/"+c1.modelo+" agora por R$ "+c1.calcularNovoPrecoComDesconto(10.0));
	}
}
