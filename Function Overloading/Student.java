package Function;

public class Student {
	void details(int rollno)
	{
		System.out.println("The student roll no is : " + rollno);
	}
	
	void details(String name)
	{
		System.out.println("The student name is : " + name);
	}

	void details(int rollno, String name)
	{
		System.out.println("Roll no is : " + rollno );
		System.out.println("Student name : " + name);
		System.out.println(rollno + " " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.details(1);
		s1.details("Gauravi");
		s1.details(2, "Siddharth");
		s1.details(3, "Santosh");
	}

}
