package avaliacoes;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	// construtor
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	// funcoes
	public String aplicarQuestao() {
		return this.enunciado;
	}
	
	public boolean corrigir(String resposta) {
		if (this.resposta.equals(resposta)) {
			return true;
		}
		return false;
	}

	// gets ans sets
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	
	

}
