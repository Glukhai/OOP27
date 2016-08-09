package lesson3;

public class Task1 {

	public static void main(String[] args) {
		String str = "Hallo world";
		String res = str.replaceAll("hallo", "[foo]"); // замена слов на основе регулярных выражений;
		
		
System.out.println(res);
System.out.println(str);
	}

}
