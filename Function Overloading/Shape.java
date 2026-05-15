package Function;

public class Shape {
	void area(int side)
	{
		System.out.println("Square area is : " + (side*side));
		
	}
	
	void area(int length , int breadth)
	{
		System.out.println("Area of rectangle is : "+ (length * breadth));
	}
	
	void area(float radius )
	{
		System.out.println("Ara of circle is : " + (3.14f * radius * radius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		System.out.println("Area details of Square, Rectangle and Square are : ");
		s1.area(4);
		s1.area(3, 6);
		s1.area(5);
		s1.area(3.4f);
		

	}

}
