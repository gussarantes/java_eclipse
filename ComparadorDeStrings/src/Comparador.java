
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = new String("Oi, tudo bem? Vem sempre aqui?");
		s2 = new String("Oi, tudo bem? Vem sempre aqui?");
		
		if(s1==s2){
			System.out.println("mesma área de memória");
		}
		else {
			System.out.println("áreas de memória diferente");
		}
		
		if(s1.equals(s2)) {
			System.out.println("mesmo conteúdo");
		}
		else {
			System.out.println("conteúdos diferentes");
		}
		
		// se s1 e s2 são obejtos (apontam para o mesmo lugar -sem o new) tudo q eu alterar via s2, reflete em s1
		
		s2 = "Agora vai....";
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}

}
