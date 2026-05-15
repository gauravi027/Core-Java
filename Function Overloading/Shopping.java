package Function;

public class Shopping {
	void bill(int price)
	{
		System.out.println("Total bill is : " + price);
	}
	
	void bill(int price , int quantity)
	{
		System.out.println("Total bill is : "+ (price*quantity));
	}
	
	void bill(int price, int quantity , int discount)
	{
		System.out.println("Final bill with discount is : "+ ((price*quantity)-discount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s1 =  new Shopping();
		System.out.println("Bill will be : ");
		s1.bill(300);
		s1.bill(100, 3);
		s1.bill(100,3 , 50);

	}

}
