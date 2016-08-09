package lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("text");
	Scanner scn = new Scanner(System.in);
	while (scn.hasNextLine()){
	System.out.println(scn.nextLine());
}
}
}