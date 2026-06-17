-----------------------------Question 1-----------------------------------
package Array2D;

import java.util.Scanner;


public class MainDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		//input 
		for(int i=0 ; i<rows ;i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println("The elements of array are : [ "+i+" ] [ "+j+" ]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		// normal matrix
		System.out.println("Normal matrix is : ");
		for(int i=0 ; i<rows ;i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//Diagonal in matrix
		System.out.println("Diagonal of matrix is : ");
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols ; j++)
			{
				if(i == j)
				{
					System.out.print(arr[i][j] + " ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
        sc.close();
	}

}

-----------------------------Question 2-----------------------------------
package Array2D;

import java.util.Scanner;

public class AlternateElments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		
		//input
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter elememts "+(i+1)+ " : ");
			arr[i] = sc.nextInt();
		}
		
		//output
		System.out.println("Alernate elements from array are : ");
		for(int i=0; i<size ; i+=2)
		{
			System.out.print(arr[i]+" ");
		}
        sc.close();
	}

}

-----------------------------Question 3-----------------------------------
package Array2D;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		
		//input
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter elememt "+(i+1)+ " : ");
			arr[i] = sc.nextInt();
		}
        
		
		//output
		System.out.println("Prime elements from array are : ");
		for(int i=0; i<size ; i++)
		{
			int count = 0;
			
			for(int j=1 ; j<=arr[i] ; j++)
			{
				if(arr[i] % j == 0)
				{
					count++;
				}
			}
			
			if (count == 2)
			{
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}

-----------------------------Question 4-----------------------------------
package Array2D;

import java.util.Scanner;

public class AddArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size for array 1 : ");
        int size1 = sc.nextInt();

        System.out.println("Enter size for array 2 : ");
        int size2 = sc.nextInt();

        if(size1 != size2)
        {
            System.out.println("Arrays cannot be added because their sizes are different.");
        }
        else
        {
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            int[] arr3 = new int[size1];

            // Input first array
            System.out.println("Enter elements of Array 1 : ");
            for(int i = 0; i < size1; i++)
            {
                System.out.println("Element " + (i + 1) + " : ");
                arr1[i] = sc.nextInt();
            }

            // Input second array
            System.out.println("Enter elements of Array 2 : ");
            for(int i = 0; i < size2; i++)
            {
                System.out.println("Element " + (i + 1) + " : ");
                arr2[i] = sc.nextInt();
            }

            // Add arrays
            for(int i = 0; i < size1; i++)
            {
                arr3[i] = arr1[i] + arr2[i];
            }

            // Print third array
            System.out.println("\nAddition of two arrays is : ");

            for(int i = 0; i < arr3.length; i++)
            {
                System.out.print(arr3[i] + " ");
            }
        }

        sc.close();
    }
}
-----------------------------Question 5-----------------------------------
package ArrayPractice;

import java.util.Scanner;

public class MAXnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		//input
		for(int i=0; i<size ; i++)
		{
			System.out.println("Enter the element "+(i+1)+"of array  : ");
			arr[i] = sc.nextInt();
			
		}
		
		//output
		System.out.println("Final array is : ");
		for(int i=0; i<size ; i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		
		//max 
		int max1 = arr[0];
		int max2 = arr[0];
		
		for(int i=1 ; i<arr.length; i++)
		{
			if (arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
				
			}
			else if(arr[i] > max2 )
			{
				max2 = arr[i];
			}
		}
            System.out.println("\nFirst Maximum Element will be : " + max1);
            System.out.println("\nSecond Maximum Element will be : "+ max2);
            
            sc.close();
	}
	
            
}

