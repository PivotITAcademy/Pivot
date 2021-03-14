package classesnmethods;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student1 = new Student(1,"John");
		
		System.out.println("College Name for student1 : "+Student.collegeName);
		
		Student student2 = new Student(1,"John");
		
		System.out.println("College Name for student2 : "+Student.collegeName);
		Student.collegeName = "Humber";
	//	Student student3 = new Student(1,"Sujith");
		System.out.println("College Name for student1 : "+Student.collegeName);
		
		
		System.out.println("College Name for student1 : "+Student.collegeName);
		
		
		
		
		
		
//		String student1Grade = student1.getGrade();
//		System.out.println("Grade :"+student1Grade);
		
		
	}

}
