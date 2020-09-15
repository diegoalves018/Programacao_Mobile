package mobile_Exerc;

public class HorarioSeg {
private int segundo;
	
	
	void setSegundo(int s) {
		if(s >= 0 && s <= 86399) {
			this.segundo = (int) s;
		}
	}
	
	int getSegundo() {
		return segundo%3600%60%60;
	}
	
	int getHora() {
		return segundo/3600;
	}
	
	int getMinuto() {
		return segundo%3600/60;
	}
	
	public void incrementaSegundo() {
		segundo++;
		if(segundo == 60) {
			segundo = 0;
		}
	}
	
	public void incrementaMinuto() {
		segundo++;
		if(segundo == 3600) {
			segundo = 0;
		}
	}
	
	public void incrementaHora() {
		segundo++;
		if(segundo == 82800) {
			segundo = 0;
		}
	}
}
