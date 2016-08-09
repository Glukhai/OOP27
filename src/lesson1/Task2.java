package lesson1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Task2 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("text", false); // дописать--- тру
		writer.write("hello world"); // не написало, нужно записать буфер!!! нужен єнд.
		writer.write("hello world22222");
	//	writer.write(StringvalueOfwriter.write("hello world");)
		PrintWriter writer1 = new PrintWriter("text1");  
		  writer1.println("gfhff");
		for (int i = 0; i < 1000; i++) {
			writer.write("hello world");
			writer.write(System.lineSeparator());
		}
		
//writer.flush();	//пишем
//writer.close(); // закрываем
	}

}
