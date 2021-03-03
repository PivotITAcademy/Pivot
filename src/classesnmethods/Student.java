package classesnmethods;

public class Student {

	//Variables
	int rollNo;
	String  name;
	int totalMarks;
	String collegeName;
	
	//methods
	
	public  void study() {
		System.out.println("Study well");
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
	
	
	
	public static void main(String args[]) {
		Student student1 = new Student();
		student1.rollNo=1;
		student1.name="John";
		student1.totalMarks=65;
		
		String student1Grade = student1.getGrade();
		System.out.println("Grade :"+student1Grade);
	}
}
