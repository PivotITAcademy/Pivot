package arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1;
	 int b=2, c=3,d=4;
	 
	 //store 5 numbers - Array
	 // DataType[] variableName = new DataType[n] where n = no of values i can store in that array.
	 //int[] numbers = new int[5];
	 
	 //Initialize Array using intializer block
	 int[] number = {80,80,60};//Already Know the values
 
	 //Intialize array using dimension
	 int[] rollNos = new int[30]; //Amount of space i need 
		
	 String[] studentNames = new String[30];
		
	Scanner scanner = new Scanner(System.in);
	
	//System.out.println("Enter Roll number");
	
	//Store value in array
	
	// rollNos[0] =  scanner.nextInt();
	 
//	 System.out.println("Enter student name");
//	 
//	studentNames[0] = scanner.next();
//	
	//Access a value stored in array
	//System.out.println("RollNo : "+rollNos[0] + " StudentName : "+studentNames[0]);
	

	double[] doubleArray = new double[10];
	
	

	for(int i=0;i<rollNos.length;i++) {
		System.out.println("index :"+i);
		System.out.println("Enter Roll number");
		rollNos[i] = scanner.nextInt();
		System.out.println("Roll no :"+rollNos[i]);
		System.out.println(" *****************");
	}

}
}