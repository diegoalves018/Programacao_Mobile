package mobile_Exerc;

import java.io.Serializable;

public class HorarioSeg implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int totalSeg = 0;


	public HorarioSeg() {
		this.setTotalSeg(0);
	}

	public HorarioSeg(int segundos) {
		this.setTotalSeg(segundos);
	}

	public int getTotalSeg() {
		return this.totalSeg;
	}

	private void setTotalSeg(int segundos) {
		this.totalSeg = segundos % 86400;
		
	}
	
	public void setMinuto(int minutos) {
		
	}
	
    public void setHora(int horas) {
		
	}
    
    public void setSegundo(int segundos) {
		
	}

	public int getSegundo() {
		return this.getTotalSeg() % 60;
	}

	public int getMinuto() {
		return Math.floorDiv(this.getTotalSeg(), 60) % 60;
	}

	public int getHora() {
		return Math.floorDiv(this.getTotalSeg(), 3600);
	}

	public void increamentaSegundo(int segundos) {
		this.setTotalSeg(segundos);
	}

	public void increamentaMinuto(int minutos) {
		this.setTotalSeg(minutos * 60);
	}
	
	public void increamentaHora(int horas) {
		this.setTotalSeg(horas * 3600);
	}
	
	public boolean ehUltimoSegundo() {
		return this.getTotalSeg() == 86399;
	}
	
	public String format(String rp) {
		rp = rp.replace("%H", Integer.toString(this.getHora()));
		rp = rp.replace("%M", Integer.toString(this.getMinuto()));
		rp = rp.replace("%S", Integer.toString(this.getSegundo()));
		rp = rp.replace("%s", Integer.toString(this.getTotalSeg()));
		
		rp = rp.replace("%%", "%%");
		return rp;
	}
	
	public HorarioSeg adiciona(HorarioSeg a) {
		return new HorarioSeg(this.getTotalSeg() + a.getTotalSeg());
	}
	
	public HorarioSeg subtrai(HorarioSeg a) {
		return new HorarioSeg(this.getTotalSeg() - a.getTotalSeg());
	}
	
	public String toString() {
		return this.format("Horario: %Hh %Mm %Ss -> Total de segundos = %s");
	}
	
	public String toString(String rp) {
		return this.format(rp);
	}
}
