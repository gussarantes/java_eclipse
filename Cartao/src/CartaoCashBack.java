
public class CartaoCashBack extends CartaoPrePago{
	private int tipo;

	//construtor
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	//funcoes
	public boolean comprar(double valor) {
		if(super.saldo >= valor) {
			if (this.tipo == 0) {
				//gold
				super.saldo -= valor*(1-0.08);
				return true;
			}
			else if (this.tipo == 1) {
				//prata
				super.saldo -= valor*(1-0.05);
				return true;
			}
			else {
				//bronze
				super.saldo -= valor*(1-0.02);
				return true;
			}			
		}
		return false;
	}
	
	
	//gets e sets
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
