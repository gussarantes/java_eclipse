
public class TimeTeste {
	public static void main(String[] args) {
		Time t1 = new Time();
		
		t1.setTime(10, 40, 0);
		
		System.out.println(t1.exibirHoraUniversal());
		System.out.println(t1.exibirHoraPadrao());
	}
}
