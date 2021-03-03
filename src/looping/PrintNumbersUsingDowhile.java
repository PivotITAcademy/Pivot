package looping;

public class PrintNumbersUsingDowhile {

	public static void main(String args[]) {
		int num = 11 ;
		
		//execute first - then check for condition
		do {
			System.out.println(num);
			num++;
		}while(num<11);
	}
}
