package Assignment;

import java.util.*;

class GenericSwap<T>{
	T[] swap(T[] arr,int a,int b) {
		T var=arr[a];
		arr[a]=arr[b];
		arr[b]=var;
		return arr;
	}
}

public class Question1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Swapping Integer Array\n");
		Integer arr[]= {1,2,3,4,5,6};
		GenericSwap<Integer> int_swap=new GenericSwap<>();
		System.out.println("Before \n"+Arrays.toString(arr));
		System.out.println("After \n"+Arrays.toString(int_swap.swap(arr, 0, 3)));
		
		
		System.out.println("\nSwaping String Array\n");
		String arr1[]= {"Nikita1","Nikita2","Nikita3","Nikita4","Nikita5"};
		GenericSwap<String> str_swap=new GenericSwap<>();
		System.out.println("Before \n"+Arrays.toString(arr1));
		System.out.println("After \n"+Arrays.toString(str_swap.swap(arr1, 4, 2)));

	}

}
