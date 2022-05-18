package Practice;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * Practicing Switch statement
		 * Making IVR option for Bank
		 */
		
		int num;
		System.out.println("Please select the correct option");
		Scanner ivr = new Scanner(System.in);
		num = ivr.nextInt();
		
		switch(num)
		{

			case 1:
				System.out.println("Block the card");
				break;
				
			case 2:
				System.out.println("Credit & Debit Cards");
				break;
				
			case 3:
				System.out.println("Saving Account");
				break;
				
			case 4:
				System.out.println("Balance Check");
				break;
				
			case 5:
				System.out.println("Talk to customer care executive");
				break;
				
				default:
					System.out.println("Please check the input you have dialed");
					break;
					
	}

}
}