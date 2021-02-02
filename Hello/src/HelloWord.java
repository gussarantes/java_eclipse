import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("primeiro programa no eclipse");
		a = teclado.nextInt();
		System.out.println("Voce digitou: " + a);
		
		teclado.close(); 
	}
}
