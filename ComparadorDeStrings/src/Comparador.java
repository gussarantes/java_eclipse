
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = new String("Oi, tudo bem? Vem sempre aqui?");
		s2 = new String("Oi, tudo bem? Vem sempre aqui?");
		
		if(s1==s2){
			System.out.println("mesma �rea de mem�ria");
		}
		else {
			System.out.println("�reas de mem�ria diferente");
		}
		
		if(s1.equals(s2)) {
			System.out.println("mesmo conte�do");
		}
		else {
			System.out.println("conte�dos diferentes");
		}
		
		// se s1 e s2 s�o obejtos (apontam para o mesmo lugar -sem o new) tudo q eu alterar via s2, reflete em s1
		
		s2 = "Agora vai....";
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}

}
