package staticExamples;

public class OuterClass {

	static String msg ="Hello from outer class";
	
	 public static class NestedStaticClass { 
		  
	        // Only static members of Outer class 
	        // is directly accessible in nested 
	        // static class 
	        public void printMessage() 
	        { 
	   
	            System.out.println( 
	                "Message from nested static class: "
	                + msg); 
	        } 
	    } 
	 
	 public class InnerClass { 
		  
	        // Both static and non-static members 
	        // of Outer class are accessible in 
	        // this Inner class 
	        public void display() 
	        { 
	            System.out.println( 
	                "Message from non-static nested class: "
	                + msg); 
	        } 
	    } 
	 
	 
	 public static void main(String arg[]) {
		 OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
		 nestedStaticClass.printMessage();
		 
		 
		 OuterClass outer = new OuterClass(); 
	        OuterClass.InnerClass inner 
	            = outer.new InnerClass(); 
	        
	        inner.display();
		  
	 }

}
