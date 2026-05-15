package Function;

public class Bank {
	void interest( int p , int r)
	{
		System.out.println((p * r * 1)/ 100);
		
	}
	void interest ( int p, int r , int t)
	{
		System.out.println((p*r*t)/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		System.out.println("Bank interest details are :-");

        b.interest(100000, 5);
        b.interest(10000, 5, 2);
	}

}
