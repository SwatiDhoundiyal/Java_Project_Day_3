package in.ac.sharda;

import java.util.Arrays;

public class MainDay3 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) { 
			arr[i]= (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString((arr)));
	}
	   
	}


