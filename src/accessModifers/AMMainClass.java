package accessModifers;

import java.util.Scanner;

import amusementPark.AmusementParkRide;
import accessModifers.Person;

public class AMMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DataType
		Person person = new Person(91,20,5767657);
		System.out.println("Person variables from constructor : " +person.weight + "   height : "+person.height +"   sin: "+person.getSinCardNumber());
		
		 
		//CRA want to change the SIN no. 
		
		//Calls the person to get the pin No
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide your pin no");
		
		int pin = scanner.nextInt();
		
		//CRA has your pin
		
	//	person.setSinCardNumber(676868, true, pin);
		
		person.setSinCardNumber(676868, false, pin);
		
	System.out.println("Person variables from constructor : " +person.weight + "   height : "+person.height +"   sin: "+person.getSinCardNumber());
		
		
		
	}

}
