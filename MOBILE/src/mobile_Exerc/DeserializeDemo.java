package mobile_Exerc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	 public static void main(String [] args) {
	      Horario h = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         h = (Horario) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Horario class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Horario...");
	      System.out.println("Hora: " + h.hora);
	      System.out.println("Minuto: " + h.minuto);
	      System.out.println("Segundo: " +h.segundo);
	    
	   }

}

