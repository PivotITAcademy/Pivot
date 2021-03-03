package looping;

import java.util.Scanner;

public class PrintNameOfMonth {

	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int i = scanner.nextInt();
		
		String month="";
	

		
		switch(i) {
		
		case 1: month = "January";
		break;
		
		case 2: month = "Febuary";
		break;
		case 3: month = "March";
		break;
		case 4: month = "April";
		break;
		case 5: month = "May";
		break;
		case 6: month = "June";
		break;
		case 7: month = "July";
		break;
		case 8: month = "August";
		break;
		case 9: month = "September";
		break;
		case 10: month = "October";
		break;
		case 11: month = "November";
		break;
		case 12: month = "December";
		break;
		default: System.out.println("Not a valid month");
		
		}
		
		System.out.println("Month :"+month);
	}
}
