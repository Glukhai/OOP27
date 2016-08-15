package lesson2;
import java.io.*;
public class Task2 {
// ���������� ����� �� �����
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("d:// text.txt");
		
//		//reader.read(arg0, arg1, arg2)
//		while (true){
//			int ch = reader.read();
//			if (ch ==-1){break;}
//			else {
			//	System.out.println(ch); // utf code
//				System.out.print((char)ch);
			
				
		//	int ch1;
		//	while ((ch1 = reader.read()) !=-1){System.out.print((char)ch1); //������ ������ ���� �� �� ����������;
			
	//		int ch2;
	//		String res ="";
	//		while ((ch2 = reader.read()) !=-1){
				// res = res =(char) ch2 + " ";
		//		 res +=  (char) ch2;
			//	 System.out.println(res);
			//	 System.out.print(res.length());
				 //������ ������ ���� �� �� ����������;
//		}
//	int	ch3 = 0;
//	while (ch3 = reader.read()) !=-1)
		
		{	
		char[] buff = new char[20];
			int count;
			String res = "";
			StringBuilder builder = new StringBuilder();
			
			while ((count = reader.read(buff)) !=-1){
			String part = new String(buff, 0,count); // ������ 
			builder.append(part);
			String result = builder.toString();
			//builder.
			//System.out.print(count);
			System.out.print(buff);
			
			
		}
		
}
}	
	
}

