package task;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        
		        String input = scanner.nextLine();

		        String obj = "  ";

		        
		        for (int i = input.length() - 1; i >= 0; i--) {
		        	
		            obj = obj + input.charAt(i);
		        }

		     
		        System.out.println("Reversed string: " + obj);

		        scanner.close();
		    }
		}


	
