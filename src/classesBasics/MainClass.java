package classesBasics;

public class MainClass {

	public static void main(String[] args) {
		
		//Create an object

		Rectangle A = new Rectangle();
		//Length of A should be 5
		A.length = 5;
		A.breadth = 4; //Breadth of A should be 4
		
		//Print the length of rectangle A
		
		System.out.println(" Length of rectangle A : "+A.length);
		
		int c= A.calculateAreaWithParameters(5,2);
	       int b = A.area;
	       
	       System.out.println("Joyce answer "+A.area);
	       System.out.println("Harpreet answer :"+b);
	       System.out.println("Sujith answer : "+ A.calculateAreaWithParameters(5, 2));
	       System.out.println("Harpreet answer :"+c);

		
	}

}

