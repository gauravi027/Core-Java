package Function;



public class Calculator {
	int add( int a , int b)
	{
		return a+b;
		
	}
	int add(int a , float b)
	{
		return a;
		
	}
	float add(float a , float b)
	{
		return b;
	}
	double add(double a , double b)
	{
		return a+b;
		
	}
	double add(int a , double b)
	{
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator c = new Calculator();
			System.out.println(c.add(12,23));
			System.out.println(c.add(34, 4.5f));
			System.out.println(c.add(4.5f, 6.4f));
			System.out.println(c.add(3.6, 5.5));
			System.out.println(c.add(6, 5.5));

	}

}
