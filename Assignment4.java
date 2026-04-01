--------------------------------------------------------- Question 1 --------------------------------------------------------

package Assignment4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.printf("a = %d \nb = %d \n", a,b);

	}

}

------------------------------------------------------Question 2-----------------------------------------------------------

package Assignment4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int fact=1;
		
		for(int i=1; i<=n ; i++)
			fact = fact * i;
		
		System.out.printf("Factorial is : %d", fact);
	}

}

--------------------------------------------------- Question 3 ----------------------------------------------------------
package Assignment4;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.printf(" %d ",j);
				
			}
			
		System.out.println( );	

	}
}
}

----------------------------------------------- Question 4 -------------------------------------------------------------
package Assignment4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n=5;
				
				for(int i=n; i>=1 ; i--) {
					for(int j=1; j<=i ; j++) {
						System.out.printf(" %d ",j);
						
					}
					
				System.out.println( );	

			}
	}
}

---------------------------------------------- Question 5 ------------------------------------------------------------

package Assignment4;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int sum=0;
		int temp = n;
		
		while(n>0) {
			int digit = n % 10;
			sum = sum + (digit * digit * digit);
			n = n / 10;
			
		}
			
		if (sum==temp)
			System.out.printf("Armstrong number");
		else
			System.out.printf("Not an armstrong number");
		

	}

}








