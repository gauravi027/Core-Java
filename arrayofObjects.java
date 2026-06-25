------------------------------------------ Movie Array ---------------------------------------------
package Objects;

import java.util.Scanner;

public class Movie {
	int movieid;
	String movieName;
	double rating;
	
	Movie()
	{
		this.movieid = 0;
		this.movieName = "Not Given";
		this.rating = 0.0;
		
	}
	
	Movie(int movieid , String movieName , double rating)
	{
		this.movieid = movieid;
		this.movieName = movieName;
		this.rating = rating;
		
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	void display()
	{
		System.out.println("Movie id : "+this.movieid);
		System.out.println("Movie Name : "+this.movieName);
		System.out.println("Movie Ratings : "+this.rating);
		System.out.println("---------------------------------------");
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		Movie[] arr = new Movie[size];
		
		arr[0] = new Movie(101 , "Rockstar" , 10);
		arr[1] = new Movie(102  , "Laila-Majnu" , 9.9);
		arr[2] = new Movie(103 , "Shiddat" , 9.3);
		arr[3] = new Movie(104 , "Mohobattein" , 9.4);
		
		for(int i=0; i<arr.length ; i++)
		{
			arr[i].display();
		}
		
		double max = arr[0].rating;
		double min = arr[0].rating;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].rating > max )
			{
				max = arr[i].rating ;
			}
		}
		
		for(int i = 0; i<arr.length ; i++)
		{
			if(arr[i].rating < min)
			{
				min = arr[i].rating ;
			}
		}
		
		System.out.println("Maximum rating of a movie : "+max);
		System.out.println("Minimum rating of a movie is : "+min);
		System.out.println("---------------------------------------");
		//to display movie 
		int maxIndex = 0;
		
		for(int i=0 ; i<arr.length; i++)
		{
			if (arr[i].rating > arr[maxIndex].rating)
			{
				maxIndex = i;
				
			}
		}
		System.out.println("Movie with maximum rating is : ");
		arr[maxIndex].display();
		
		int minIndex =0;
		
		for(int i=0 ; i<arr.length; i++)
		{
			if (arr[i].rating < arr[minIndex].rating)
			{
				minIndex = i;
				
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Movie with minumum rating is : ");
		arr[minIndex].display();
		
sc.close();
	}

}
------------------------------------------------- Circle Array --------------------------------------------
package Objects;

public class Circle {
	int cno;
	int radius;
	double area;
	
	
	Circle()
	{
		this.cno = 0;
		this.radius = 0;
		
		
	}
	
	Circle(int cno , int radius )
	{
		this.cno = cno;
		this.radius = radius;
		
	}
	
	

	
	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	double area()
	{
		return 3.14 * radius * radius;
	}
	
	void display()
	{
		System.out.println("Circle no is : "+this.cno);
		System.out.println("Rdius of circle is : "+this.radius);
		System.out.println("Area of Circle is  : "+area());
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] arr = new Circle[4];
		
		arr[0] = new Circle(1 , 6);
		arr[1] = new Circle(2 , 7);
		arr[2] = new Circle(3 , 10);
		arr[3] = new Circle(4 , 3);
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i].display();
		}
	
		double areamax = arr[0].area();
		double areamin = arr[0].area();
	
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[0].area() > areamax)
			{
				areamax = arr[0].area();
				
			}
		}
		for(int i=0; i<arr.length ; i++)
		{
			if(arr[0].area() < areamin)
			{
				areamin = arr[0].area();
			}
		}
		System.out.println("Maimum Area : "+areamax);
		System.out.println("Minimum Area : "+areamin);

	}

}
----------------------------------------- Product Array ------------------------------------------
package Objects;

public class Product {
	int prodid;
	String prodname;
	double prodprice;
	
	Product()
	{
		this.prodid = 0;
		this.prodname = " Not mentioned";
		this.prodprice = 0.0;
		
	}
	
	Product(int prodid , String prodname , double prodprice)
	{
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
		
	}
	
	

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getProdprice() {
		return prodprice;
	}

	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	
	void display()
	{
		System.out.println("Product id : "+this.prodid);
		System.out.println("Product Name : "+this.prodname);
		System.out.println("Product price : "+this.prodprice);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] arr = new Product[7];
		
		arr[0] = new Product(1,"Siddharth" , 9000);
		arr[1] = new Product(2,"Sid" , 90000);
		arr[2] = new Product(3,"Sidd" , 90);
		arr[3] = new Product(4,"Gauravi" , 900);
		arr[4] = new Product(5,"Gaur" , 900000);
		arr[5] = new Product(6,"Gau" , 9);
		arr[6] = new Product(7,"GS" , 10);
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i].display();
		}
		
		double max = arr[0].prodprice;
		double min = arr[0].prodprice;
		
		for(int i = 0; i<arr.length ; i++)
		{
			if(arr[i].prodprice > max )
			{
				max = arr[i].prodprice ;
			}
		}
		System.out.println("------------------------");
		System.out.println("Maximum price of product is :"+max);
		System.out.println();
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].prodprice < min)
			{
				min = arr[i].prodprice;
			}
		}
		System.out.println("------------------------");
		System.out.println("Minimum Price of product is : "+min);
		System.out.println();
		
		System.out.println("------------------------");
		
		//descending order of price
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[i].prodprice < arr[j].prodprice)
				{
					Product temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("Descending order is : ");
		for(int i=0 ;i<arr.length; i++)
		{
			arr[i].display();
		}
		
		System.out.println("------------------------");
		
		//ascending order of price
		for(int i=0; i<arr.length ; i++)
		{
			for(int j = i+1 ; j<arr.length ;j++)
			{
				if(arr[i].prodprice >arr[j].prodprice)
				{
					Product temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp ; 
					
				}
			}
		}
		
		System.out.println("Ascending order is : ");
		for(int i=0; i<arr.length ; i++)
		{
			arr[i].display();
		}

	}

}
 ---------------------------------------- Student Array --------------------------------------------

   package Objects;

public class Student {
	int rollno;
	String name;
	int marks;
	
	
	Student()
	{
		this.rollno = 0;
		this.name = "Not given ";
		this.marks = 0;
		
	}

	Student(int rollno, String name , int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	void display()
	{
		System.out.println("Roll Number : "+this.rollno);
		System.out.println("Name : "+this.name);
		System.out.println("Marks : "+this.marks);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = new Student[7];
		
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		arr[0] = new Student(1 , "Siddharth" , 90);
		arr[1] = new Student(2 , "Gauravi" , 75);
		arr[2] = new Student(3 , "Santosh" , 89);
		arr[3] = new Student(4 , "Harsh" , 70);
		arr[4] = new Student();
		arr[5] = new Student(5 , "Siddhi" , 66);
		arr[6] = new Student(6 , "Hari" , 68);
		
		
		arr[0].display();
		arr[1].display();
		arr[2].display();
		arr[3].display();
		
		arr[4].setRollno(5);
		arr[4].setName("Ishwari");
		arr[4].setMarks(73);
		arr[4].display();
		
		arr[5].display();
		arr[6].display();
		int max = arr[0].marks;
		int min = arr[0].marks;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].marks > max)
			{
				 max = arr[i].marks;
				
			}
			
		}
		 System.out.println("Maximum Marks are : "+max);

		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].marks < min)
			{
				 min = arr[i].marks;
					
			}
			
		}
		System.out.println("\nMinimum Marks are : "+min);
	}

}

---------------------------------------------Employee Array-------------------------------------------------
  package Objects;


public class Employee {
	int id;
	String name;
	double Salary;
	
	Employee()
	{
		this.id = 0;
		this.name = "Not Given ";
		this.Salary= 0 ;
	}
	
	Employee(int id , String name , double Salary)
	{
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}
	int getid()
	{
		return id;
	}
	void setid(int id)
	{
		this.id = id;
	}
	
	String getname()
	{
		return name;
		
	}
	
	void setname(String name)
	{
		this.name = name;
	}
 
	double getSalary()
	{
		return Salary;
	}
	
	void setSalary(double Salary)
	{
		this.Salary = Salary;
	}
	
	void display()
	{
		System.out.println("Employee id: "+ this.id);
		System.out.println("Emloyee name :"+this.name);
		System.out.println("Employee Salary : "+this.Salary);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] arr = new Employee[3];
		
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		arr[0]=new Employee();
		arr[1]=new Employee(10, "Sachin",20000);
		arr[2]=new Employee();
		
		arr[0].setid(1);
		arr[0].setname("Gauravi");
		arr[0].setSalary(50000);
		
		arr[0].display();
		System.out.println();
		
		System.out.println(arr);
		
		for(int i=0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);//gives address of object
		}
		

	
		for (int i=0; i<arr.length; i++)
		{
			arr[i].display();
		}
		
		double max = arr[0].Salary;
		double min = arr[0].Salary;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].Salary > max)
			{
				 max = arr[i].Salary;
				
			}
			
		}
		 System.out.println("Maximum Salary is : "+max);

		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].Salary < min)
			{
				 min = arr[i].Salary;
					
			}
			
		}
		System.out.println("\nMinimum Salary is : "+min);
	}

}

--------------------------------------------------Books Array ----------------------------------------------
  package Objects;



public class Books {
	int bookid;
	String title;
	String Author;
    Double price ;
	
	Books()
	{
		this.bookid = 0;
		this.title = "Not Given";
		this.Author = "Not Given";
		this.price = 0.0;
	}
	
	Books(int bookid , String title , String Author , double price)
	{
		this.bookid = bookid;
		this.title = title;
		this.Author = Author;
		this.price = price;
		
    }

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	void display()
	{
		System.out.println("Book Id : "+this.bookid);
		System.out.println("Title of Book : "+this.title);
		System.out.println("Book Author : "+this.Author);
		System.out.println("Price of book : "+this.price);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Books[] arr = new Books [6];
		
		arr[0] = new Books(1,"Gauravi's life", "Siddharth Lagad" , 5000);
		arr[1] = new Books(2, "Siddharth's Life is RULED BY ?" , "Gauravi Lagad ", 6000);
		arr[2] = new Books(3, "MY Life is RULED BY ?" , "Siddh Lagad ", 3000);
		arr[3] = new Books(4, "MY Life is RULED BY ?" , "Siddharth Lagad ", 4000);
		arr[4] = new Books(5, "SANTOSH's Life is RULED BY ?" , "Sujata Shinde ", 9000);
		arr[5] = new Books(6, "Shambhu's Life is RULED BY ?" , "Shambhu himself ", 10000);
		
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i].display();
		}
		
		double max = arr[0].price;
		double min = arr[0].price;
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].price > max)
			{
				 max = arr[i].price;
				
			}
			
		}
		 System.out.println("Maximum Price of book is  : "+max);

		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i].price < min)
			{
				 min = arr[i].price;
					
			}
			
		}
		System.out.println();
		System.out.println("\nMinimum price of book is  : "+min);
		
	//for ascending order 
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i].price > arr[j].price)
				{
					Books temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending order of price is : ");
		
		for(int i=0; i<arr.length ; i++)
		{
			arr[i].display();
		}
		
		//descending order
		for(int i=0; i<arr.length ;i++)
		{
			for(int j=i+1 ; j< arr.length ; j++)
			{
				if(arr[i].price < arr[j].price)
				{
					Books temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
			}
		}
		System.out.println();
		System.out.println("Descending order of Price of books is : ");
		for(int i = 0; i<arr.length ; i++)
		{
			arr[i].display();
		}

	}

}
