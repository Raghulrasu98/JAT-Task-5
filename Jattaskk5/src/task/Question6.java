package task;

import java.util.Scanner;

public class Question6 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int month = sc.nextInt();        
		        float rent = sc.nextFloat();      
		        int days = sc.nextInt();       

		        
		        switch (month) {
		            case 4: case 5: case 6: case 11: case 12:
		                rent = rent * 1.2f;
		                break;
		        }

		        float total = rent * days;

		        
		        System.out.printf("%.2f", total);

		        sc.close();
		    }
		}


	


