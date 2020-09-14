package mobile_Exerc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String [] args) {
	      Horario h = new Horario();
	      h.hora = 12;
	      h.minuto =34;
	      h.segundo = 12;
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("C:\\Horario.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(h);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in/C:/Horario.ser ");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }

}



