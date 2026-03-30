package assignment2;

/*
 * Question 1: Write a Java program to check if a number is EVEN or ODD.
 */

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=4;
		if(no%2==0)
			System.out.printf("The number %d is EVEN",no );
		else
			System.out.printf("The number %d is ODD ", no);
		

	}

}

_______________________________________________________________________________________________________________________________________________

package assignment2;

/*
 * Question 2: Write a Java program to check if a number is a PALINDROME.
 */

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=141;
		int res=ispallindrome(no);
		if(res==1)
			System.out.printf("The number %d is Pallindrome", no);
		else
			System.out.printf("The number %d is not a pallindrome", no);
		

	}
    static int ispallindrome(int no)
    {
    	return 1;
    }
}

________________________________________________________________________________________________________________________________________________


package assignment2;

/*
 * Question 3: Write a Java program to check if a year is a LEAP YEAR.
 */

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year= 2026;
		if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0 )
			System.out.printf("Year %d is said to be leap", year);
		else
			System.out.printf("The year %d is not a leap year", year);
		
	}

}

_______________________________________________________________________________________________________________________________________________

package assignment2;

/*
 * Question 4: Write a Java program to check voting eligibility based on age.
 */

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		if(age < 18)
			System.out.printf("The candidate of age %d is not eligible to vote",age);
		else
			System.out.printf("The candidate of age %d is eligible to vote", age);
		

	}

}

_____________________________________________________________________________________________________________________________________________

package assignment2;

/*
 * Question 5: Write a Java program to check if a character is a VOWEL or CONSONANT.
 */

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch= 'U';
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' || ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			System.out.printf("The charachter %c is a Vowel", ch);
		else
			System.out.printf("The charachter %c is an constant",ch);
		
		

	}

}

_______________________________________________________________________________________________________________________________________________

package assignment2;

/*
 * Question 6: Write a Java program to check if a character is UPPERCASE or LOWERCASE.
 */

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				char ch = 'G';
				if(ch>='A' && ch<='z')
					System.out.printf("The charachter %c is Uppercase character",ch);
				else if(ch>='a' && ch<='z')
					System.out.printf("The charachter %c is Lowercase charachter",ch);
				else
					System.out.printf("This is not a charachter");
				

			}

		}
