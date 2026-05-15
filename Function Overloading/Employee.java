package Function;

public class Employee {
	void salary(int basic)
	{
		System.out.println("The Salary is = " + basic);
		
	}
	void salary(int basic, int bonus)
	{
		System.out.println("Salary is = " + (basic + bonus));
	}
	void salary(int basic, int bonus , int incentive)
	{
		System.out.println("Salary is = "+ (basic + bonus + incentive));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println("so the list goes...");
		e.salary(300000);
		e.salary(30000, 40000);
		e.salary(30000, 38000, 40400);

	}

}
