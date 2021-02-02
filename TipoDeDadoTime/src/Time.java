
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;	
	}
	
	public String exibirHoraUniversal() {
		return hora+":"+minuto+":"+segundo;
	}
	
	public String exibirHoraPadrao() {
		if (hora>12) {
			return (hora-12)+":"+minuto+":"+segundo+" PM";
		}
		else if (hora==12) {
			return (hora)+":"+minuto+":"+segundo+" PM";
		}
		else if (hora==0){
			return 12+":"+minuto+":"+segundo+" AM";
		}
		else {
			return hora+":"+minuto+":"+segundo+" AM";
		}
		
	}
	
	

}
