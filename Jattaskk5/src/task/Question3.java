package task;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int nu = scanner.nextInt();

		        int num = 1; 
	       
		        for (int i = 1; i <= nu; i++) {
		           
		          for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println(); 
		        }

		        scanner.close();
		    }
		}

	