package classesBasics;

public class MainShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a rectangle and calculate area.
//		Shape rectangle = new Shape();
//		
//		//Initialize length and breadth for object rectangle 
//		rectangle.length = 5;
//		rectangle.breadth = 4;
//		
//		
//		//Calling calculateArea() method  and passing value
//		double area = rectangle.calculateArea("Rectangle");
//		
//		System.out.println("Rectangle area : "+area);
//		
//		
//	
//		//Create a circle shape and calculate it's area;
//		Shape circle = new Shape(5);
//		
//		area = circle.calculateArea("Circle");
		
		
		//System.out.println("Circle area : "+area);
		
		
		
		//Create object
		Shape cube = new Shape(1, 2, 3);
		
		
		double volume = cube.calculateVolume();
		
		System.out.println("Volume : "+volume);
		
		
		
		//Create rectangle and calculate area
		Shape rectangle = new Shape(5,4);
		double area = rectangle.calculateArea("Rectangle");
		System.out.println("Rectangle area : "+area);
		
		

	}

}
