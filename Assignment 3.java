------------------------------- Assignment 3 ----------------------------------------

1. Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
desired operations.
------------------------------solution----------------------------------------------

package Assignment3;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=40;
		int n2=20;
		int sum=n1+n2;
		System.out.printf("Addition of %d and %d is: %d\n ",n1,n2,sum );
		
		int sub=n1-n2;
		System.out.printf("\nThe subtraction of %d and %d is: %d\n",n1,n2,sub);
		
		int mul=n1*n2;
		System.out.printf("\nThe multiplication of %d and %d is: %d\n",n1,n2,mul );
		
		int div=n1/n2;
		System.out.printf("\nThe divsion of %d and %d is: %d\n",n1,n2,div);
		
		

	}

}


____________________________________________________________________________________________

2. Accept three sides of a triangle from the user and determine whether the triangle is
equilateral, isosceles, or scalene.

-----------------------------------Solution-------------------------------------------
package Assignment3;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=20;
		int s2=30;
		int s3=50;
		
		if(s1==s2 && s2==s3 && s3==s1)
			System.out.printf("The triangle is an equilateral triangle");
		else if(s1==s2 || s2==s3 || s3==s1)
			System.out.printf("The triangle is isoceles");
		else
			System.out.printf("The triangle is scalene");
		

	}

}

________________________________________________________________________________________________

3. Write a program to find greatest of three numbers using nested if-else.

-----------------------------solution------------------------------------------------------------

package Assignment3;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2=20;
		int n3=30;
		if(n1>n2 && n1>n3)
			System.out.printf("The number %d is greatest among three numbers",n1);
		else if(n2>n1 && n2>n3)
			System.out.printf("The number %d is greatest among three numbers",n2);
		else
			System.out.printf("The number %d is greatest among three numbers",n3);
		

	}

}

_________________________________________________________________________________________________

4. Ask the user to enter marks.
Then show the result based on these rules:
If marks are more than 75 → show "Distinction"
If marks are more than 65 → show "First Class"
If marks are more than 55 → show "Second Class"
If marks are 40 or more → show "Pass Class"
If marks are less than 40 → show "Fail"

---------------------------------------Solution-------------------------------------------------

package Assignment3;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 64;
		
		if(marks>=75)
			System.out.printf("Distinction");
		else if(marks>=65)
			System.out.printf("First class");
		else if(marks>=55)
			System.out.printf("Second class");
		else if(marks>=40)
			System.out.printf("Pass");
		else
			System.out.printf("Fail");
		

	}

}

_________________________________________________________________________________________________

Accept a number and check if it is divisible by 3, 5, or both.
(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
both" or” Divisible by None”)

---------------------------------------Solution---------------------------------------------------

package Assignment3;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		if(num%3==0 && num%5==0)
		System.out.printf("The number %d is divisible by both 3 and 5",num );
		else if(num%5==0)
			System.out.printf("The number %d is divisible by 5",num );
		else if(num%3==0)
			System.out.printf("The number %d is divisible by 3",num );
		else
			System.out.printf("Number %d is neither divisible by 3 and nor by 5",num);

	}

}


_______________________________________________________________________________________________

Accept the age and check if the person is:
Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
                           
-------------------------------------solution--------------------------------------------------
package Assignment3;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=59;
		if(age<12)
			System.out.printf("This age %d is a child",age );
		else if(age>=12 && age<20)
			System.out.printf("The age %d is a Teenager", age);
		else if(age>=20 && age<60)
			System.out.printf("The age %d is Adult",age);
		else
			System.out.printf("The age %d is Senior", age);
		

	}

}

__________________________________________________________________________________________________

