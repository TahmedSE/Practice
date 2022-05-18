package Practice;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Practicing switch and break statement
		 *  making a ivr option for hospital
		 */
		
		int num;
		System.out.println("Please provide a correct option");
		Scanner Hospital = new Scanner(System.in);
		num = Hospital.nextInt();
		
		switch(num)
		{
		
		case 1 :
			System.out.println("Emergency");
			break;
			
		case 2 :
			System.out.println("Reception");
		    break;
		
		case 3  :
			System.out.println("Appointment");
			break;
			
		case 4 :
			System.out.println("Laboratory");
			break;
			
		case 5 :
			System.out.println("For any other assistance");
		    break;
		    
		    default :
		    	System.out.println("You have not select the correct option please select the correct option");
		
		
	}
	}
}
