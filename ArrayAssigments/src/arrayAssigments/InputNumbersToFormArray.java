package arrayAssigments;

import java.util.Scanner;

public class InputNumbersToFormArray {
	
	public static void main(String[] args) {
		
		int size = 0;
		
		  System.out.println("How many numbers are on your mind?");
		  Scanner scan = new Scanner (System.in);            
		  size = scan.nextInt();

		  int[] number = new int[size];       
		  System.out.println("Please input the " + size + " on your mind");
		  for (int i = 0; i < size; i++) {
		    number[i] = scan.nextInt(); 
		    
		  }
		  System.out.println("The size of array is " + size);
		}	
}
