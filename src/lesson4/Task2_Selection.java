package lesson4;

import java.util.Arrays;

public class Task2_Selection {

	public static void main(String[] args) {
		int [] arr = {10,9, 8, 7, 6, 5, 4, 3, 2, 1};
		  
		 SelectionSort(arr);
		  
		  System.out.println(Arrays.toString(arr));

	}

	public static void SelectionSort(int[] array) {
		for (int j = 0; j < array.length - 1; j++) {
			int minIndx = j;
			for (int i = 0; i < array.length; i++) {

				if (array[i] < array[minIndx]) {
					minIndx = i;

				}
				// System.out.print(minIndx);
			}
		}
	}
		 
public static void	swap1(int arr[], int i, int j) {
		int tmp = arr[i];
		 j = arr[i];
		arr[j] = tmp;
		
	}
	

}