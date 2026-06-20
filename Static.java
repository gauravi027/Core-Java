-----------------------------------------Question 1 ----------------------------------------
package Static;

import java.util.Scanner;

public class ElectricityBill {
	int custid;
	String custname;
	int unitsConsumed;
	static double ratePerUnit = 10.02 ;
	
	ElectricityBill()
	{
		this.custid = 0;
		this.custname = "Not Specified";
		this.unitsConsumed = 0;
		
	}
	
	ElectricityBill(int custid , String custname , int unitsConsumed)
	{
		this.custid = custid;
		this.custname = custname;
		this.unitsConsumed = unitsConsumed;
		
	}
	
	int getcustid() {
		return custid;
	}
	
	void setcustid(int custid)
	{
		this.custid = custid;
	}
	
	String getcustname()
	{
		return custname;
	}
	
	void setcustname(String custname)
	{
		this.custname = custname;
	}
	
	int getunitsConsumed()
	{
		return unitsConsumed;
	}
	void setunitsConsumed(int unitsConsumed)
	{
		this.unitsConsumed = unitsConsumed;
	}
	
	static double getratePerUnit()
	{
		return ratePerUnit;
	}
	static void setratePerUnit(double rpu)
	{
		ratePerUnit = rpu; //becoz it is static so no keyword "this"
	}
	
	double calculateBill()
	{
		return unitsConsumed * ratePerUnit ; 
	}
	void display()
	{
		System.out.println("Customer id is : "+this.custid);
		System.out.println("Customer name is : "+this.custname);
		System.out.println("electricity consumed per unit is : "+this.unitsConsumed);
		System.out.println("Rate per unit : "+this.ratePerUnit);
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Customer name : ");
		String name = sc.next();
		
		System.out.println("Enter the Units Consumed : ");
		int units = sc.nextInt();
		
		ElectricityBill e1 = new ElectricityBill(id , name , units);
		e1.display();
		System.out.println("Amount of this bill is  : "+e1.calculateBill());
		
		System.out.println();
		
		ElectricityBill e2 = new ElectricityBill(id , name , units);
		e2.display();
		System.out.println("Amount of this bill is  : "+e2.calculateBill());

		System.out.println();
		
		ElectricityBill e3 = new ElectricityBill(id , name , units);
		e3.display();
		System.out.println("Amount of this bill is  : "+e3.calculateBill());

		sc.close();
	}

}
-----------------------------------------Question 2 ----------------------------------------
  package Static;

import java.util.Scanner;

public class EmployeeSalary {
	int empid;
	String empname;
	double salary;
	static double bonusrate = 9.6;
	
	EmployeeSalary()
	{
		this.empid = 0;
		this.empname = "Not Mentioned";
		this.salary = 0;
		
	}
	
	EmployeeSalary(int empid, String empname , double salary)
	{
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	int getempid()
	{
		return empid;
	}
	String getempname()
	{
		return empname;
	}
	double getsalary()
	{
		return salary;
	}
	static double getbonusrate()
	{
		return bonusrate;
	}
	
	void setempid(int empid)
	{
		this.empid = empid;
	}
	
	void setempname(String empname)
	{
		this.empname = empname;
	}
	
	void setsalary(double salary)
	{
		this.salary = salary;
	}

	void setbonusrate(double bRate)
	{
		bonusrate = bRate;
	}
	
	double CalculateSalary()
	{
		return salary+(salary*bonusrate/100);
	}
	void display()
	{
		System.out.println(" Employe id : "+this.empid);
		System.out.println(" Employee Name : "+ this.empname);
		System.out.println(" Employee Salary : "+this.salary);
		System.out.println(" Employee Bonus Rate : "+this.bonusrate);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id : ");
		int eid = sc.nextInt();
		
		System.out.println("Enter Emolyee Name : ");
		String ename = sc.next();
		
		System.out.println("Enter Basic Employee Salary : ");
		double esalary = sc.nextDouble();
		
		EmployeeSalary e1 = new EmployeeSalary(eid , ename , esalary  );
		e1.display();
		System.out.println("Employee Salary : "+e1.CalculateSalary());

		System.out.println();
		
		sc.close();
	}

}


-----------------------------------------Question 3 -----------------------------------------
package Static;

import java.util.Scanner;

public class LibraryUser {
	int userid;
	String username;
	int latedays;
	static int fineperday = 10;

	LibraryUser()
	{
		this.userid = 0;
		this.username = "Not Mentioned";
		this.latedays = 0;
		
	}

	LibraryUser(int userid , String username , int latedays)
	{
		this.userid = userid;
		this.username = username;
		this.latedays = latedays;
	}
	
	int getuserid()
	{
		return userid;
	}
	
	String getusername()
	{
		return username;
	}
	
	int getlatedays()
	{
		return latedays;
	}
	
	static int getfineperday()
	{
		return fineperday;
	}
	
	void getuserid(int userid)
	{
		this.userid = userid;
	}
	
	void getusername(String username)
	{
		this.username = username;
	}
	
	void getfineperday(int fpd)
	{
		fineperday = fpd;
	}
	
	void getlatedays(int latedays)
	{
		this.latedays = latedays;
	}
	
	int Totalfine()
	{
		return latedays * fineperday;
	}
	
	void display()
	{
		System.out.println("Use id : "+ this.userid);
		System.out.println("Username : "+ this.username);
		System.out.println("Late Days are : "+ this.latedays);
		System.out.println("Fine per day is : "+ this.fineperday);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user id :");
		int id = sc.nextInt();
		
		System.out.println("Enter the username : ");
		String name = sc.next();
		
		System.out.println("Enter the Late days : ");
		int ldays = sc.nextInt();
		
		LibraryUser l1 = new LibraryUser( id,  name, ldays);
		l1.display();
		System.out.println("Total fine will be : "+l1.Totalfine());
		

	}

}


 -----------------------------------------Question 4 ----------------------------------------
  package Static;

import java.util.Scanner;

public class LibraryUser {
	int userid;
	String username;
	int latedays;
	static int fineperday = 10;

	LibraryUser()
	{
		this.userid = 0;
		this.username = "Not Mentioned";
		this.latedays = 0;
		
	}

	LibraryUser(int userid , String username , int latedays)
	{
		this.userid = userid;
		this.username = username;
		this.latedays = latedays;
	}
	
	int getuserid()
	{
		return userid;
	}
	
	String getusername()
	{
		return username;
	}
	
	int getlatedays()
	{
		return latedays;
	}
	
	static int getfineperday()
	{
		return fineperday;
	}
	
	void getuserid(int userid)
	{
		this.userid = userid;
	}
	
	void getusername(String username)
	{
		this.username = username;
	}
	
	void getfineperday(int fpd)
	{
		fineperday = fpd;
	}
	
	void getlatedays(int latedays)
	{
		this.latedays = latedays;
	}
	
	int Totalfine()
	{
		return latedays * fineperday;
	}
	
	void display()
	{
		System.out.println("Use id : "+ this.userid);
		System.out.println("Username : "+ this.username);
		System.out.println("Late Days are : "+ this.latedays);
		System.out.println("Fine per day is : "+ this.fineperday);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user id :");
		int id = sc.nextInt();
		
		System.out.println("Enter the username : ");
		String name = sc.next();
		
		System.out.println("Enter the Late days : ");
		int ldays = sc.nextInt();
		
		LibraryUser l1 = new LibraryUser( id,  name, ldays);
		l1.display();
		System.out.println("Total fine will be : "+l1.Totalfine());
	
	}

}
 
