package mobile_Exerc;

public class Principal {

	public static void main(String args[]) {
		
		HorarioSeg h1 = new HorarioSeg();
		HorarioSeg h2 = new HorarioSeg(58974);
		HorarioSeg h3 = new HorarioSeg(86399);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		System.out.println(h2.format("%H:%M:%S"));
		
		SerializeDemo.toFile("./horarioseg.ser", h2);
		HorarioSeg h4 = SerializeDemo.fromFile("./horarioseg.ser");
		System.out.println(h4.format("%H:%M:%S"));
	}
}

