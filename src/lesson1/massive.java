package lesson1;

import java.util.ArrayList;


public class massive {

	public static void main(String[] args) {
	int [] array = new int[10];
	System.out.println(array.length);
	System.out.println(array[0]);
 ArrayList<Integer> list = new ArrayList<>();
 
list.add(10);
list.add(10);
list.add(10);
list.add(1,10);
	
System.out.println(list.size());
System.out.println(list.get(1));
System.out.println(list.contains(10)); // находится ли 5 там
System.out.println(list.indexOf(10)); // находится ли 5 там >>>> -1 0
list.removeIf((e)->  e%2 !=0);  // лямбда с 8й джаві удаление четніх
list.forEach((e)->System.out.println(e));
list.removeIf((e)->{  
	System.out.println(e);
// if	e%2 !=0} else {});	
	}
	
	
	public static int sum (int [] array){
		int result  = 0;
		for (int i=0;i<array.length; i++){
			result  += array[i];}
			return result;
			
		}
	
	
	public static void removeallodd (ArrayList<Integer> list){
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2 != 0){
			 list.remove(i);
			 i--; //сдвигаем назад чтоб чнова пройти!!!!
			}
			
		}
		
		
	}
	
	}
	
	

