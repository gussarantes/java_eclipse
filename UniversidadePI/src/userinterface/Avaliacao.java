package userinterface;

import avaliacoes.QuestaoSimples;
import avaliacoes.QuestaoComDica;
import avaliacoes.QuestaoMultiplaEscolha;
import java.util.Scanner;


public class Avaliacao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		// variaveis ficam como private???
		String resposta;
		int resultado = 0;
		
		QuestaoSimples perguntas[];
		perguntas = new QuestaoSimples[5];
		perguntas[0] = new QuestaoSimples("Quanto é 2 + 2?", "4");
		perguntas[1] = new QuestaoSimples("Quanto é 2 + 3?", "5");
		perguntas[2] = new QuestaoSimples("Quanto é 2 + 4?", "6");
		perguntas[3] = new QuestaoMultiplaEscolha("Quanto é 2 + 5?", "B", "6", "7", "8", "Nenhuma das anteriores");
		perguntas[4] = new QuestaoComDica("Quanto é 2 + 6?", "8", "mesmo que 4 + 4.");
		
		for (int i=0; i <=4 ; i++) {
			System.out.println(perguntas[i].aplicarQuestao()); 
			resposta = teclado.nextLine();
			if (perguntas[i].corrigir(resposta)) {
				resultado++;
			}
		}
		
		System.out.println("Nota :" + resultado);
		
		teclado.close();
	}

}
