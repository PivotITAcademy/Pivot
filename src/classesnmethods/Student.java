package classesnmethods;



public class Student {

	//Variables
	 int rollNo;
	String  name;
	int totalMarks;
	 static String collegeName = "Waterloo";
	 
	 
	//methods
	
	Student(int r,String studentName){
		rollNo=r;
		name=studentName;
		
	}
	
	public String getGrade() {
		
		String grade ="";
		
		if (totalMarks>=90){
			grade="A";
		}else if(75<=totalMarks && totalMarks<90) {
			grade ="B";
		}else if(totalMarks<75 && totalMarks>=50) {
			grade="C";
		}else if(totalMarks<50 & totalMarks>=35) {
			grade="D";
		}else {
			grade="Fail";
		}
		
		return grade;
	}
	
	
	
}
