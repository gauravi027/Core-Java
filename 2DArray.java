---------------------------------------Question 1 ----------------------------------------------
package Array2D;

import java.util.Scanner;

public class ArrayPresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int cols = sc.nextInt();
		
		int [] [] arr = new int [rows][cols];
		
		//input
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println("Enter element : [ " + i + " ][ "+ j + " ] " );
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		//output
		System.out.println("\nThe Matrix is : ");
		
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<cols ; j++)
			{
				System.out.print(arr[i][j] + " "); //we used print here to print elements on same row
			}
			System.out.println(); // moves to next row 
		}
		
		
        sc.close();
	}

}


---------------------------------------Question 2 ----------------------------------------------
 package Array2D;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no. of columns : ");
		int cols = sc.nextInt();
		
		int[] [] arr = new int[rows][cols] ;
		
		//input 
		for(int i=0 ; i<rows ;i++)//rows
		{
			for(int j=0 ; j<cols; j++)//columns
			{
				System.out.println("Enter element : [ "+ i + " ] [ " + j + " ]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		//search
		System.out.println("Enter the Element 'X' to be searched from 2D array : ");
		int x = sc.nextInt();
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(arr[i][j] == x)
				{
					System.out.println("element 'X' is found at location : [ "+i+" ] [ "+j+" ] ");
				}
			}
		}
		
		//output
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols ; j++)
			{
				System.out.print(arr[i][j] + " ");//all the elements that belong to same row appear on same line due to print()
			}
			System.out.println();//prints text and then prints new line 
		}
		
		
	sc.close();

	}

}

---------------------------------------Question 3 ----------------------------------------------
  package Array2D;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		//input
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols ; j++)
			{
				System.out.println("Enter element : [ "+i+" ] [ "+j+" ] ");
				arr[i][j] = sc.nextInt();
			}
		}
        //output normal matrix
		System.out.println("Normal matrix is : ");
		for(int i=0; i<rows ; i++)
		{
			for(int j=0; j<cols ; j++)
			{
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//transpose matrix
		System.out.println("\nTranspose Matrix is : ");
		for(int j=0 ; j<cols ; j++)
		{
			for(int i=0; i<rows; i++ )
			{
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
				
		}
		sc.close();
	}
       
}       
