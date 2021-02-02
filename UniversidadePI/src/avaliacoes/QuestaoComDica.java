package avaliacoes;

public class QuestaoComDica extends QuestaoSimples{
	private String dica;

	//construtor
	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	// funcoes
		public String aplicarQuestao() {
			return super.enunciado + "\n Dica: " + this.dica;
		}	
	
	// gets e sets
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	

	
	

}
