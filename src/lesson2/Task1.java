package lesson2;
import java.io.*;
public class Task1 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text");
		
		//reader.read(arg0, arg1, arg2)
		for (int i = 0; i < 150; i++) {
			int ch = reader.read();
		//	System.out.println(ch); // utf code
			System.out.print((char)ch); 
		}
	}

}
