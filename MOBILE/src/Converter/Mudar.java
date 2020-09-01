package Converter;

public class Mudar {
	public static void main(String[] args) {
		
	int hora = 0;
	int minuto = 0;		
	int seg = 86399;
				
		if (seg >= 3600) {
		    hora = (seg / 3600);
		    seg = seg - (hora * 3600);
		}
		
		if (seg >= 60) {
		    minuto = (seg / 60);
		    seg = seg - (minuto * 60);
		}	
		
	System.out.println(hora + "h "+ minuto + "m "+ seg + "s");
	
  }
}
