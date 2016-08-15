package lesson3;

import java.util.Arrays;

public class Task2 {

	
	public static void main(String[] args) {

		 int arr [] = {1,5,8,54,7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print (arr[i]+ " ");	
System.out.println(Arrays.toString(arr));
	
		 
		 bublesort(arr);
		 System.out.println(Arrays.toString(arr));
	}

	public static void bublesort(int[] arr) {
                 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
		//			int j = [j];
		//			int k = [j+1];
		//			swap(j,k);
				}
			}
		}
	}

	
	public static void swap(int j, int k) {
		int tmp = j;
		j = k;
		k = tmp;
		
	}

}
