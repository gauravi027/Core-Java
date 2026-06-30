----------------------------------------Shapes ----------------------------------------------
package Polymorphism;



class Shape
{
	int area;
	
	Shape()
	{
		this.area = 0;
		
	}
	Shape(int area)
	{
		this.area  = area;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	void display()
	{
		
	    System.out.println();
	}
	double calculateArea()
	{
		return area;
	}
}//shape

class Circle extends Shape
{
	int radius;
	
	
	Circle()
	{
		super();
		this.radius = 0;
	}
	
	Circle(int area , int radius)
	{
		super(area);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	void display()
	{
		super.display();
		
	    System.out.println("Radius : " + radius);
		System.out.println("Radius : "+this.radius);	
	}
	double calculateArea() {
	    return 3.14 * radius * radius;
	}
}//class circle ends here

class Triangle extends Shape
{
	int base;
	int height;
	
	Triangle()
	{
		super();
		this.base = 0;
		this.height = 0;
		
	}
	Triangle(int area , int base , int height)
	{
		super(area );
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	void display()
	{
		super.display();
	
		System.out.println("Base : "+this.base);
		System.out.println("Height : "+this.height);
		
		
	}
	double calculateArea()
	{
		return 0.5 * base * height;
	}
	
}//triangle ends
class Rectangle extends Shape
{
	int length;
	int breadth;
	
	
	Rectangle()
	{
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	Rectangle(int area ,int length ,int breadth)
	{
		super(area);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	void display()
	{
	
		System.out.println("Length : "+this.length);
		System.out.println("Breadth : "+this.breadth);
		
	}
	double calculateArea()
	{
		return length * breadth;
	}
}//rectangle ends here
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1;
		
		s1 = new Circle(12,23);
		s1.display();
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		s1 = new Triangle(30 , 20 , 12);
		s1.display();
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		s1 = new Rectangle(200, 20, 10);
		s1.display();
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		
		
	}


	}


----------------------------------------- Employee ------------------------------------------
package Polymorphism;


class Employe {
	int id;
	String name;
	double salary;
	static int count;
	static
	{
		count =0;
	}
	
	Employe()
	{
		this.id=0;
		this.name="Not Defined";
		this.salary=0;
		count++;
	}
	
	Employe(int id , String name , double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}
	
	

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employe.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Emoplyee id : "+this.id);
		System.out.println("Employee name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
			}
	double calsal()
	{
		return salary;
	}
	
}//employee ends here
	class Admin extends Employe
	{
		double allowance;
	
	
	Admin()
	{
		super();
		this.allowance = 0;
		
	}
	
	Admin(int id, String name ,double salary , double allowance)
	{
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance = "+this.allowance);
		System.out.println("Total Salary is : "+(salary + allowance));

	}
	double calsal()
	{
		return salary+allowance;
	}
	
}
	class SalesManager extends Employe
	{
		double incentive;
		double target;
		
		
		SalesManager()
		{
			super();
			this.incentive = 0;
			this.target = 0;
			
		}
		
		SalesManager(int id, String name ,double salary , double incentive , double target)
		{
			super(id, name,salary);
			this.incentive = incentive;
			this.target = target;
			
		}

		public double getIncentive() {
			return incentive;
		}

		public void setIncentive(double incentive) {
			this.incentive = incentive;
		}

		public double getTarget() {
			return target;
		}

		public void setTarget(double target) {
			this.target = target;
		}
		
		void display()
		{
			super.display();
			System.out.println("The incentive is : "+this.incentive);
			System.out.println("The Target is : "+this.target);
			System.out.println("Total Salary = " + (salary + incentive));
		}
		double calsal()
		{
			return salary+incentive;
		}
		
	}
	
	class HR extends Employe
	{
		double commission;
		
		HR()
		{
			super();
			this.commission = 0;
			
		}
		
		HR(int id, String name ,double salary , double allowance , double incentive , double target , double commission)
		{
			super(id,name,salary);
			this.commission = commission;
		}

		public double getCommission() {
			return commission;
		}

		public void setCommission(double commission) {
			this.commission = commission;
		}
		
		void display()
		{
			System.out.println("The Commission is : "+this.commission);
		
		}
		double calsal()
		{
			return salary+commission;
		}
		
	}
	
public class Emp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe e1 = new Employe(1,"Gauravi", 500000); 
		e1.display();
		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println();
		
		e1 = new Admin(2, "Anushka", 700000 ,6000);//upcasting done
		e1.display();
		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println();
		
		e1 = new SalesManager(3 , "Dhiraj", 60000,  3000.0 , 40000.0);//upcasting done
		e1.display();
		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println();
		

		e1 = new HR (4, "Saujanyaa" ,60000, 800, 7000, 60000,90000);//upcasting done
		e1.display();
		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println();
		
		// here are the changes here is done upcasting 
		
		System.out.println();
		
		Employe.getCount();
		System.out.println("Total count of Employeea are : "+Employe.getCount());
			

	}

}

----------------------------------------Sports --------------------------------------------
package Polymorphism;



class Player
{
	String name;
	int age;
	String Country;
	int matchesPlayed;
	int jersynum;
	static int count;
	static {
		count = 0;
	}
	
	Player()
	{
		this.name = "Not Given";
		this.age = 0;
		this.Country = " Not Given";
		this.matchesPlayed = 0;
		this.jersynum = 0;
		count++;
		
	}
	Player(String name, int age, String Country, int matchesPlayed, int jersynum) {
	    this.name = name;
	    this.age = age;
	    this.Country = Country;   
	    this.matchesPlayed = matchesPlayed;
	    this.jersynum = jersynum;
	    count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Player.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getJersynum() {
		return jersynum;
	}
	public void setJersynum(int jersynum) {
		this.jersynum = jersynum;
	}
	
	void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Country : "+this.Country);
		System.out.println("Matches PLayed : "+this.matchesPlayed);
		System.out.println("Jersy Number : "+this.jersynum);
	}	
	void play() {
	    System.out.println(name + " is playing Football.");
	    System.out.println("Scoring goals and passing the ball.");
	}
}//ends

class Cricket extends Player
{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	Cricket()
	{
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = "Not given";
		this.bowlingStyle = "Not given";
	}
	
	Cricket(String name,int age, String Country , int matchesPlayed , int jerseyNumber, int totalRuns , int totalWickets , String battingStyle , String bowlingStyle)
	{
		super(name , age , Country , matchesPlayed , jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getTotalWickets() {
		return totalWickets;
	}

	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	void display()
	{
		super.display();
		
	}
	void play() {
	    System.out.println(name + " is playing Cricket.");
	    System.out.println("Scoring runs and taking wickets.");
	}
}//ends

class Football extends Player
{
	int totalGoals;
	String playingPosition;
	
	Football()
	{
		super();
		this.totalGoals = 0;
		this.playingPosition = "NotGiven";
	}
	
	Football(String name,int age, String Country , int matchesPlayed , int jerseyNumber , int totalGoals , String playingPosition)
	{
		super(name , age , Country , matchesPlayed , jerseyNumber);
		this.totalGoals = totalGoals;
		this.playingPosition = playingPosition;
	}

	public int getTotalGoals() {
		return totalGoals;
	}

	public void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	public String getPlayingPosition() {
		return playingPosition;
	}

	public void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}
	
	void display()
	{
		super.display();
		System.out.println("Total Goals : "+this.totalGoals);
		System.out.println("Playing Position : "+this.playingPosition);
	}
	
}
public class Sporty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Player p1;

		    p1 = new Cricket("A", 30, "Brazil", 12, 1, 5000, 800, "Good", "Best");
		    p1.display();
		    p1.play();
		    System.out.println("----------------");

		    p1 = new Football("B", 20, "Australia", 3, 6, 78, "Central");
		    p1.display();
		    p1.play();
		    System.out.println("----------------");

		    System.out.println("Total Players are : " + Player.getCount());
		
	}

}

 -----------------------------------------Vehicles --------------------------------------------------
package Polymorphism;

class Vehicle
{
	int vno;
	String model;
	String companyName;
	int totalwheels;
	double price;
	static double count;
	static {
		count = 0 ;
	}
	
	Vehicle()
	{
		this.vno = 0;
		this.model = "Not Given";
		this.companyName = "Not Given";
		this.totalwheels = 0;
		this.price = 0;
		count++;
	}
	
	Vehicle(int vno, String model ,String companyName , int totalwheels , double price)
	{
		this.vno =vno;
		this.model = model;
		this.companyName = companyName;
		this.totalwheels = totalwheels;
		this.price = price;
		count++;
	}

	public static double getCount() {
		return count;
	}

	public static void setCount(double count) {
		Vehicle.count = count;
	}

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int totalwheels() {
		return totalwheels;
	}

	public void settotalwheels(int totalwheels) {
		this.totalwheels = totalwheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println(" Vehicle no : "+this.vno);
		System.out.println(" Model : "+this.model);
		System.out.println(" Company Name : "+this.companyName);
		System.out.println(" No of Wheels : "+this.totalwheels);
		System.out.println(" Price : "+this.price);
		System.out.println();
	}
	 void brake() {
	        System.out.println("Vehicle applies brakes.");
	    }
}//class vehicle ends

class Bike extends Vehicle
{
	int noOfStands;
	int noOfHelmets;
	String category;
	
	Bike()
	{
		super();
		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.category ="Not Given ";
	}
	
	Bike(int vno, String model ,String companyName , int totalwheels , double price , int noOfStands , int noOfHelmets , String category)
	{
		super(vno , model , companyName , totalwheels , price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.category = category;
	}

	public int getNoOfStands() {
		return noOfStands;
	}

	public void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	public int getNoOfHelmets() {
		return noOfHelmets;
	}

	public void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Stands : "+this.noOfStands);
		System.out.println("No of helmets : "+this.noOfHelmets);
		System.out.println("Category of Bike : "+this.category);
		System.out.println();
	}
	 void brake() {
	        System.out.println("Bike applies drum brakes.");
	    }
}//class bike ends here 

class Car extends Vehicle
{
	String hasPowerSteering;
	String drivemode;
	String parkingAssisteSensors;

	Car()
	{
		super();
		this.hasPowerSteering = " Not given";
		this.drivemode = "Not given";
		this.parkingAssisteSensors = "Not Given";
	}
	
	Car(int vno, String model ,String companyName , int totalwheels , double price , int noOfStands , int noOfHelmets , String category , String hasPowerSteering , String drivemode ,String parkingAssisteSensors)
	{
		super(vno , model , companyName , totalwheels , price);
		this.hasPowerSteering = hasPowerSteering;
		this.drivemode = drivemode;
		this.parkingAssisteSensors = parkingAssisteSensors;
		
	}

	public String getHasPowerSteering() {
		return hasPowerSteering;
	}

	public void setHasPowerSteering(String hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	public String getDrivemode() {
		return drivemode;
	}

	public void setDrivemode(String drivemode) {
		this.drivemode = drivemode;
	}

	public String getParkingAssisteSensors() {
		return parkingAssisteSensors;
	}

	public void setParkingAssisteSensors(String parkingAssisteSensors) {
		this.parkingAssisteSensors = parkingAssisteSensors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Power Steering : "+this.hasPowerSteering );
		System.out.println("Drive mode : "+this.drivemode);
		System.out.println("Parking Assister sensors : "+this.parkingAssisteSensors);
		System.out.println("Car.display()");
	}
	 void brake() {
	        System.out.println("Car applies disc brakes.");
	    }
}//class car closed

class Bus extends Vehicle
{
	int passCap;
	int standCap;
	
	Bus()
	{
		super();
		this.passCap = 0;
		this.standCap = 0;
		
	}
	
	Bus(int vno, String model ,String companyName , int totalwheels , double price , int noOfStands , int noOfHelmets , String category , String hasPowerSteering , String drivemode ,String parkingAssisteSensors , int passCap , int standCap)
	{
		super(vno , model , companyName , totalwheels , price);
		this.passCap = passCap;
		this.standCap = standCap;
	}

	public int getPassCap() {
		return passCap;
	}

	public void setPassCap(int passCap) {
		this.passCap = passCap;
	}

	public int getStandCap() {
		return standCap;
	}

	public void setStandCap(int standCap) {
		this.standCap = standCap;
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity of Passenger seats : "+this.passCap);
		System.out.println("Capacity of Passengers to stand : "+this.standCap);
		System.out.println();
	}
	 void brake() {
	        System.out.println("Vehicle bus applies air brakes.");
	    }
}//bus ends here

public class Vehicles {
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle(1 , "Sedan" , "TATA" , 4 , 4000000);
		v1.display();
		v1.brake();
		System.out.println();
		
		v1 = new Bike(2 , "Platinum" ,"TVS " , 2 , 2000000 , 2 , 2 , "Sports" );
		v1.display();
		v1.brake();
		System.out.println();
		
		v1 = new Car(3 ,"Virtus","Wolkswagen",4 ,15000000 ,0,0,"none","Yes","Automatic","Eight");
		v1.display();
		v1.brake();
		System.out.println();
		
		v1 =new Bus(4 , "Volvo 9400" , " Volvo" , 6  , 4500000.0 , 0 , 0 , "None" , "Yes" , "Mannual", "Eight" , 50 , 20);
		v1.display();
		v1.brake();
		System.out.println();
	}

}

