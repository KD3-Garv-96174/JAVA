package javaAssignment;

import java.util.Scanner;

public class Assignment1_3 {
	
	 public static int menulist() {
		 int choice;
		    System.out.println("Menulist :  ");
			System.out.println("1. Dosa  20$");
			System.out.println("2. Samosa  10$");
			System.out.println("3. Idli  30$");
			System.out.println("4. Tea  10$");
			System.out.println("5. Poha  20$");
			System.out.println("6. Generate Bill  :");
			System.out.println("Enter Your Choice : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			return choice;
	 }
     public static void main(String[] args) {
    	 
    	 int choice , quantity = 0 ;
    	 double totalAmount = 0;
    	 Scanner sc1 = new Scanner(System.in);
    	 do {
    		 choice = menulist();
    		 switch(choice) {
    		 case 1 : {
    			 System.out.println("Enter Quantity : ");
    			 quantity = sc1.nextInt();
    			 totalAmount = totalAmount +( 20 * quantity);	
    			 break;
    		 }
    		 case 2 : {
    			 System.out.println("Enter Quantity : ");
    			 quantity = sc1.nextInt();
    			 totalAmount = totalAmount +( 10 * quantity);	
    			 break;
    		 }
    		 case 3 : {
    			 System.out.println("Enter Quantity : ");
    			 quantity = sc1.nextInt();
    			 totalAmount = totalAmount +( 30 * quantity);	
    			 break;
    		 }
    		 case 4 : {
    			 System.out.println("Enter Quantity : ");
    			 quantity = sc1.nextInt();
    			 totalAmount = totalAmount +( 10 * quantity);	
    			 break;
    		 }
    		 case 5 : {
    			 System.out.println("Enter Quantity : ");
    			 quantity = sc1.nextInt();
    			 totalAmount = totalAmount +( 20 * quantity);	
    			 break;
    		 }
    		 case 6 : {
    			 System.out.println("Total Bill : " + totalAmount );
    			 break;
    		 }
    		 }
    	 }while(choice != 0);
    	 
		
	}
}
