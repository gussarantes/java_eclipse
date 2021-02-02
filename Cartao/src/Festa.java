
public class Festa {
	public static void main(String[] args) {
		CartaoPrePago c1  = new CartaoPrePago("0000 1111 2222 3333","Nome Completo 1", 2028, 01, 0);
		
		c1.adicionarCredito(2000.00);
		System.out.println("Saldo: " + c1.getSaldo());
		
		c1.comprar(2500.00);
		System.out.println("Saldo: " + c1.getSaldo());
		
		CartaoCashBack c2  = new CartaoCashBack("4444 55555 2222 3333","Nome Completo 2", 2028, 05, 0, 0);
		
		c2.adicionarCredito(3000.00);
		System.out.println("Saldo: " + c2.getSaldo());
		
		c2.comprar(100.00);
		System.out.println("Saldo: " + c2.getSaldo());
	}
}
