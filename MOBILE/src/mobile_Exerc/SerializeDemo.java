package mobile_Exerc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void toFile(String path, HorarioSeg h2) {
		try {
			ObjectOutputStream fileStream = new ObjectOutputStream(new FileOutputStream(path));
			
			fileStream.writeObject(h2);
			fileStream.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
	
	public static HorarioSeg fromFile(String path) {
		HorarioSeg horarioSeg = null;
		
		try {
			ObjectInputStream fileStream = new ObjectInputStream(new FileInputStream(path));
			
			horarioSeg = (HorarioSeg) fileStream.readObject();
			fileStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return horarioSeg;
	}
}



