package arrayAssigments;

import java.util.Scanner;

public class ChangingSecondIndex {
public static void main(String[] args) {
		
		int oddNumbers = 0;
		int evenNumbers = 0;
		int i;
		  Scanner scan = new Scanner (System.in);            
		  int[] randomNumber = new int[10];

		         
		  System.out.println("Enter in 10 numbers");
		  for ( i = 0; i < randomNumber.length; i++) {
		    randomNumber[i] = scan.nextInt();
		  }
		  
		  System.out.printf("The odd numbers in this set of 10 random numbers are : ");
		  for ( i = 0; i < randomNumber.length; i++) {
			 if ( randomNumber[i] % 2 == 1) {
		    	
				System.out.printf(randomNumber[i] + " , ");
				oddNumbers ++ ;
				
				}
		  }
		  System.out.println();
		  System.out.printf("The even numbers in this set of 10 random numbers are : ");
		  for ( i = 0; i < randomNumber.length; i++) {
			 if ( randomNumber[i] % 2 != 1) {
		    	
				System.out.printf(randomNumber[i] + " , ");
				evenNumbers ++ ;
				
				}
		  }
		  
		  System.out.println();
		  System.out.println("The number of odd numbers in the set of ten random numbers are " + oddNumbers);
		  System.out.println("The number of even numbers in the set of ten random numbers are " + evenNumbers);
		  
		  System.out.println();
		  System.out.println("Lets change the number in the second index.");
		  System.out.println("The new list of the set of ten numbers are : ");
		  randomNumber [2] = 100 ;
		  for ( i = 0; i < randomNumber.length; i++) {
		  System.out.printf(randomNumber[i] + " , ");
		  }
	}  

}
