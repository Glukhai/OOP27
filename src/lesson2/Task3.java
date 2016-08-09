package lesson2;
import java.io.*;
public class Task3 {
// считывание файла до конца
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text");
				
		{	
		char[] buff = new char[20];
			int count;
			String res = "";
			StringBuilder builder = new StringBuilder();
			
			while ((count = reader.read(buff)) !=-1){
			String part = new String(buff, 0,count); // преобр 
			builder.append(buff,0,count);
			String result = builder.toString();
			
			//System.out.print(count);
			System.out.print(result);
			
			
		}
		
}
}	
	
}

