package classesBasics;

public class Rectangle {

	 //Class level variables
    int length;
    int breadth;
    int area;
   
    //A method with no returnType
    public void calculateAreawithNoReturn() {
    	area   = length*breadth;
    }
    
    //AM returnType methodName(){}
    public int calculateArea(){
        //Scope of area variable is restricted to this method only - Method level variable
       area   = length*breadth;
       return area;
    } 
    
    //AM returnType methodName(arg1, arg2){}
    
    public int calculateAreaWithParameters(int len, int bth) {
    	
    	area = len*bth;
    	return area;
    }
}
