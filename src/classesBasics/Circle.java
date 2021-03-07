package classesBasics;

public class Circle {

	double radius;
	double pi;
	
	//No arg constructor
	Circle(){
		pi=3.14;
		
	}
	
//	Circle(double r){
//	    this();
//		radius = r;
//		
//	}
	
	Circle(double r, double p){
		radius =r;
		pi=p;
	}
	
	public void calculateArea() {
		
		double area = 0.5*radius*pi;
		System.out.println("area : "+area);
	}
}
