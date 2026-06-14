---------------------------------Question 1 ----------------------------------
  package ArrayPractice;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] marks = new int [3];
		//marks[0] = 97 ;//physics
		//marks[1] = 95; //english
		//marks[2] = 93; //chemistry
		
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		
		//instead of writing it all the time lets write loop 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int marks[] = new int[size];
		
		//loop for input
		for(int i=0 ; i<size ; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		
		//loop for output
		for (int i=0 ; i<size; i++)  //array stops after it reaches to its max size 3 as per alloted
		{
			System.out.println(marks[i]);
		}		
        sc.close();     
	}

}
---------------------------------Question 2 ----------------------------------
  // Question : Take an array from user as input and Search for given number x
//  which is from the input array taken from users and print the index at which it occurs
//this is linear search technique
package ArrayPractice;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		//loop for input
		for(int i=0 ; i<size ; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		//loop for output
		for (int i=0 ; i<numbers.length; i++)  //array stops after it reaches to its max size 3 as per alloted
		{
			if(numbers[i]==x) //array will return the number you searched for in an array 
			{
				System.out.println("x found at index : " + i);
			}
			
		}
				
         sc.close();     

	}

}
---------------------------------Question 3 ----------------------------------
  package ArrayPractice;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		sc.nextLine();//this consumes the leftover new line 
		//if i dont use this line i wont be able to write full names of the people but with this i can
		
		String names[] = new String[size];
		
		//input
		for( int i=0 ; i<size ; i++)
		{
			System.out.println("Enter the name "+(i+1)+": ");
			names[i] = sc.nextLine();
			
		}
		
		//output
		System.out.println("\nNames entered are : ");
		for(int i=0; i<names.length ; i++)
		{
			System.out.println("name "+(i+1) + " is : "+names[i]);
		}
		
		
		//ask for name to search 
		System.out.println("Enter the name to be searched : ");
		String search = sc.nextLine();
		
		
		//find index position of them
		for(int i=0; i<names.length ; i++)
		{
			if(names[i].equals(search))
			{
				System.out.println(search+ "  is present at index position " + i);
			}
		}
		sc.close();
	}

}

---------------------------------Question 4 ----------------------------------
  package ArrayPractice;

import java.util.Scanner;

public class Elements {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int[] elements = new int [size];
		
		//input
		for(int i=0 ; i<size; i++)
		{
			System.out.println("The element "+(i+1)+ "  is : ");
			elements[i] = sc.nextInt();
		}
		
		//min & max
		int min = elements[0];
		int max = elements[0];
		
		for(int i=0 ; i< elements.length; i++)
		{
			if(elements[i] < min)
			{
				min = elements[i];
			}
			
			if(elements[i] > max)
			{
				max = elements[i];
			}
		}
		
		System.out.println("Minimum Element is : "+min);
		System.out.println("Maximum Element is : "+max);
		System.out.println(" ");
		
		//average of array
		int sum = 0;
		
		for(int i=0; i<elements.length; i++)
		{
			sum = sum + elements[i];
		}
		
		//using double because output of average can be a decimal
		double average = (double) sum/ elements.length;
		System.out.println("Average is : "+average);
		System.out.println(" ");
		
		//product of array
		int product = 1;
		
		for(int i=0; i<elements.length ; i++)
		{
			product = product * elements[i];
			
		}
		System.out.println(" ");
		System.out.println("The product of array will be : "+ product);
		System.out.println(" ");
		
		
		//count of even numbers from array
		int evenCount = 0;
		
		for(int i=0 ; i<elements.length; i++)
		{
			if(elements[i] % 2 == 0)
			{
				evenCount++;
				System.out.println("Even number from array is : "+ elements[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Total Count of even number from array is : "+ evenCount);
		System.out.println(" ");
		
		//count of odd numbers from array
		int oddCount = 0;
		for(int i=0 ; i<elements.length; i++)
		{
			if(elements[i] % 2 != 0)
			{
				oddCount++;
				System.out.println("Odd number from array is : "+elements[i]);
			}
		}
		System.out.println("Total Count of odd numbers from array is : "+ oddCount);
		System.out.println(" ");
		
		//count of positive numbers 
		int posCount=0;
		for(int i=0; i<elements.length; i++)
		{
			if(elements[i] > 0)
			{
				posCount++;
				System.out.println("Postive numbers from array are : "+ elements[i]);
			}
			
		}
		System.out.println("Total count of Positive numbers from array is : "+ posCount);
		System.out.println(" ");
		
		
		//count of negative numbers 
		int negCount = 0;
		for(int i=0; i<elements.length; i++)
		{
			if(elements[i] < 0)
			{
				negCount++;
				System.out.println("The negative elements from array are : "+ elements[i]);
			}
		}
		System.out.println("The Total count of negative numbers is : "+ negCount);
		System.out.println(" ");
		
		
		//sum of even numbers 
		int Evensum = 0;
		for(int i=0 ; i<elements.length ; i++)
		{
			if (elements[i] % 2 == 0)
			{
				Evensum = Evensum + elements[i];
			}
		}
		System.out.println("Sum of all even numbers from array is : "+ Evensum);
		System.out.println(" ");
		
		//sum of odd numbers 
				int Oddsum = 0;
				for(int i=0 ; i<elements.length ; i++)
				{
					if (elements[i] % 2 != 0)
					{
						Oddsum = Oddsum + elements[i];
					}
				}
				System.out.println("Sum of all odd numbers from array is : "+ Oddsum);
				System.out.println(" ");
				
		//Range of array 
			    int range=0;
			    for(int i = 0 ; i< elements.length; i++)
			    {
			    	range = max - min;
			    }
			    System.out.println("Maximum number : "+max);
			    System.out.println("Minimum number : "+min);
			    System.out.println("Maximum number - Minimum number : "+ max +"-"+ min );
			    System.out.println("The range of numbers will be : "+ range);
				
		sc.close();
	}
}
---------------------------------Question 5 ----------------------------------
  package ArrayPractice;

import java.util.Scanner;

public class Array {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array : ");
		int size = sc.nextInt();
		
		int[] array = new int [size];
		
		//for input 
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println(" Element "+ (i+1) + " is : " );
			array[i] = sc.nextInt();
			
			
		}
		for(int i =0 ; i<array.length; i++)
		{
			System.out.println("Array is : "+ array[i]);
		}
		
		System.out.println(" ");
		//Ascending check
		int acount = 0;
		for(int i = 0 ; i<array.length-1 ; i++)
		{
			if(array[i] > array[i+1]) //comparing every element with its next element
			{
				acount++;
			}
		}
		
		if (acount == 0)
		{
			System.out.println("Array is in ascending order ");
		}
		else
		{
			System.out.println("Array is not in ascending order");
		}
		
		//descending order check
		int dcount = 0;
		for(int i = 0 ; i<array.length-1 ; i++)
		{
			if(array[i] < array[i+1]) //comparing every element with its next element
			{
				dcount++;
			}
		}
		
		if (dcount == 0)
		{
			System.out.println("Array is in descending order ");
		}
		else
		{
			System.out.println("Array is not in descending order");
		}
		
		sc.close();
	}

}

  
