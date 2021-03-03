import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);// To read/take input from console use this statement 
		
		System.out.println("Are you a citizen");
		
		boolean isACitizen = scanner.nextBoolean();// read boolean value from console
		
		System.out.println("isCitizen : "+isACitizen);
		
		
		System.out.println("Enter a number");
		
		int age = scanner.nextInt();//Read integer from console
			
		//person should be a citizen and age should be greater than equal to 18 and less than 60 
		if(isACitizen && age>=18) {
			System.out.println("You can vote");
		}else {
			System.out.println("you cannot vote");
		}

	}

}
