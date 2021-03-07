package classesBasics;

public class Shape {
	
	double pi;
	double radius;
	double length;
	double breadth;
	double height;
	
	//Rectangle 
	Shape(){
		
	}
	
	Shape(double l, double b){
		length =l;
		breadth=b;
	}
	
	// Circle
	Shape(double r){
		pi =3.14;
		radius =r;
	}
	
	
	//Cube/cuboid
	Shape(double l, double b, double h){
		length = l;
		breadth =b;
		height =h;
	}
	
	//Declaring/Define method calculateArea and declare arguments
	public double calculateArea(String shapeType) {
		double area=0.0;
		
		if(shapeType.equals("Rectangle")) {
		 area = length*breadth;
		}else {
			area = pi*radius*radius;  
		}
		
		return area;
	}
	
	
	public double calculateVolume() {
		
		
		
		double volume = length*breadth*height;
		
		return volume;
		
	}

}
