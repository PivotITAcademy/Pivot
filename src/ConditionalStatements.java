import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);// To read/take input from console use this statement 
		
		int num1 = scanner.nextInt();
		
	
		
		System.out.println("Enter a second number");
		
		int num2 =scanner.nextInt();
		
		if(num1>num2) {
			System.out.println(num1-num2);
		}else if (num2 > num1) {
			System.out.print(num2-num1);
		}
		

		
		
		

	}

}
