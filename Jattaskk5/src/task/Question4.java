package task;

import java.util.Scanner;

public class Question4 {
	
       public static void main(String[] args) {
    	   
    	   
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter a number: ");
	
		 int n = scanner.nextInt();

		 for (int i = 1; i <= n; i++) {
		 if (i % 2 == 1) {
		            
		  System.out.println("* *");
		  } 
		  else  {
		     System.out.println(" *");
		 }
         }

		    scanner.close();
		 }
		}

	