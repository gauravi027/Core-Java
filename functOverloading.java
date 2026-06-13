-------------------------------------------------------------------------------------------
                                 Question 1

package PracticeSet;

import java.util.Scanner;

public class Operations {
	int n;

	int square(int n) 
	{
		return n*n;
	}

	int cube(int n)
	{
		return n*n*n;
		
	}




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Operations o = new Operations();

        System.out.println("Square is : " + o.square(n));
        System.out.println("Cube is : " + o.cube(n));

        sc.close();
    }
}


---------------------------------------------------------------------------------------------
                              Question 2

  
package PracticeSet;

import java.util.Scanner;

public class Calci {
	int a,b;
	
	int add(int a , int b)
	{
		return a+b;
	}
	double add(double a , double b )
	{
		return a+b;
	}
	double add(int a , double b)
	{
		return a+b;
	}
	double add(double a, int b )
	{
		return a+b;
	}
	

	
	int sub(int a, int b)
	{
		return a-b;
		
	}
	double sub(double a,double b)
	{
		return a-b;
	}
	double sub(int a , double b)
	{
		return a-b;
	}
	double sub(double a , int b)
	{
		return a+b;
	}
	
	
	int mul(int a, int b)
	{
		return a*b;
		
	}
	double mul(double a,double b)
	{
		return a*b;
	}
	double mul(int a , double b)
	{
		return a*b;
	}
	double mul(double a , int b)
	{
		return a*b;
	}
	 int div(int a , int b)
	 {
		 return a/b;
	 }
		double div(double a,double b)
		{
			return a/b;
		}
		double div(int a , double b)
		{
			return a/b;
		}
		double div(double a , int b)
		{
			return a/b;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		
		Calci c = new Calci();
		
		System.out.println("Addition is : "+ c.add(a,b));
		System.out.println("Subtraction is : "+ c.sub(a, b));
		System.out.println("Muliplication is : "+ c.mul(a,b));
		System.out.println("Division is :"+ c.div(a,b));
		
        sc.close();
	}

}

--------------------------------------------------------------------------------------------------
                              Question 3 

  
  
package PracticeSet;

import java.util.Scanner;

public class Area {
	int side;
	int square(int side)
	{
		return side * side;
	}
    
	int length,breadth;
	int rectangle(int length, int breadth) 
	{
		return length * breadth;
	}
	
	int base, height;
	double triangle(int base, int height)
	{
		return 0.5 * base * height;
	}
	
	int radius;
	double circle(int radius)
	{
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Area a = new Area();
		
		System.out.println("Enter Side : ");
		int side = sc.nextInt();
		
		System.out.println("Enter length : ");
		int length = sc.nextInt();
		
		System.out.println("Enter breadth : ");
		int breadth = sc.nextInt();
		
		System.out.println("Enter base : ");
		int base = sc.nextInt();
		
		System.out.println("Enter height : ");
		int height = sc.nextInt();
		
		System.out.println("Enter Radius : ");
		int radius = sc.nextInt();
		
		System.out.println("Area of Square is : "+ a.square(side));
		System.out.println("Area of Square is : "+ a.rectangle(length,breadth));
		System.out.println("Area of Square is : "+ a.triangle(base,height));
		System.out.println("Area of Square is : "+ a.circle(radius));
		
		sc.close();
	}

}

--------------------------------------------------------------------------------------------
                             Question 4

  
package PracticeSet;

import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class Loan {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of student : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the rollno : ");
		int rollno = sc.nextInt();
		
		System.out.println("Enter percentage : ");
		double percentage = sc.nextDouble();
		
		 System.out.println("\nStudent Name : " + name);
	     System.out.println("Roll Number : " + rollno);
		
		if(percentage > 80)
		{
			System.out.println("Loan approved of amount : 2,00,000");
		}
		
		else if (percentage > 60)
		{
			System.out.println("Loan approved of amount : 1,00,000");
		}
		else if (percentage > 40)
		{
			System.out.println("Loan approved of amount : 50,000");
		}
		else 
		{
			System.out.println("No loan approved ");
		}
		
		System.out.println("\n----------------------------\n");
		
		sc.nextLine();
		System.out.println("Enter the name of employee : ");
		String ename = sc.nextLine();
		
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		
		System.out.println("\nEmployee name : "+ename);
		System.out.println("Employee Salary : "+salary);
		
		if(salary > 1200000)
		{
			System.out.println("Loan is approved  : 7,00,000");
			
		}
		else if(salary > 1000000)
		{
			System.out.println("Loan approved  : 6,00,000");
			
		}
		
		else if(salary > 600000)
		{
			System.out.println("Loan approved  : 5,00,000");
		}
		
		else if( salary > 400000)
		{
			System.out.println("Loan is approved  : 4,00,000");
			
		}
		else
		{
			System.out.println("Loan is not approved due to less Salary");
		}
		
		sc.close();
		
	

	}

}
------------------------------------------------------------------------------------------
                               Question 5
  
  
  package PracticeSet;


import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Enter hours : ");
		int hr1 = sc.nextInt();
		
		System.out.println("Enter minutes : ");
		int min1 =sc.nextInt();
		
		System.out.println("Enter seconds : ");
		int sec1 = sc.nextInt();
		
		System.out.println("----------------------------");
		
		System.out.println("Enter hours : ");
		int hr2 = sc.nextInt();
		
		System.out.println("Enter minutes : ");
		int min2 = sc.nextInt();
		
		System.out.println("Enter seconds : ");
		int sec2 = sc.nextInt();
		
		//add seconds 
		int sec = sec1 + sec2 ;
		int carrymin = sec / 60;
		sec = sec % 60;
		
		//add minutes 
		int min = min1 + min2 + carrymin;
		int carryhr = min / 60 ;
		min = min % 60;
		
		//add hours
		int hr = hr1 + hr2 + carryhr;
		hr = hr % 24;
		
		System.out.println("Enter first time : " + hr1 + ":" + min1 + ":" + sec1);
		System.out.println("Enter first time : " + hr2 + ":" + min2 + ":" + sec2);
		
		System.out.println("Enter Total time : " + hr + ":" + min + ":" + sec);
		
		sc.close();
	}

}

