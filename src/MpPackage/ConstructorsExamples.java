package MpPackage;
class Student
{
	int roll;
	String name;
	String course;
	//Default constructor, if not provide explicitly, compiler will provide
	Student(){roll = 0; name=null;}
	Student(int r,String str){roll = r; name=str;}
	Student(int r,String str,String crs){roll = r; name=str;course=crs;}
	void display()
	{ System.out.println("Student Details, Roll: "+roll+" Name : "+name+" Course : "+course); }
}
class subStudent extends Student
{
	protected int fee;
	void display()
	{System.out.println("Fee is: "+fee);}
}

public class ConstructorsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		Student stud2 = new Student(10,"Sanjeev");
		Student stud3 = new Student(11,"Sanjiv","M.C.A.");
		stud.display();
		stud2.display();
		stud3.display();
		subStudent s = new subStudent();
		s.fee = 100;
		s.display();
	}

}
