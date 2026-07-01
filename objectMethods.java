--------------------------------------Vehicles ---------------------------------------------
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
	
//	void display()
//	{
//		System.out.println(" Vehicle no : "+this.vno);
//		System.out.println(" Model : "+this.model);
//		System.out.println(" Company Name : "+this.companyName);
//		System.out.println(" No of Wheels : "+this.totalwheels);
//		System.out.println(" Price : "+this.price);
//		System.out.println();
//	}
	
	public String toString() {
		return "Vehicle no = " +vno+
				"\nModel = "+model+
				"\nCompany = "+companyName+
				"\nNo of wheels = "+totalwheels+
				"\nPrice = "+price ;
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
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of Stands : "+this.noOfStands);
//		System.out.println("No of helmets : "+this.noOfHelmets);
//		System.out.println("Category of Bike : "+this.category);
//		System.out.println();
//	}
	public String toString() {
		return super.toString()+
				"\nNo of Stands = "+noOfStands+
				"\nNo Of Helmets = "+noOfHelmets+
				"\nCategory of Bike = "+category;
		
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
	
//	void display()
//	{
//		super.display();
//		System.out.println("Power Steering : "+this.hasPowerSteering );
//		System.out.println("Drive mode : "+this.drivemode);
//		System.out.println("Parking Assister sensors : "+this.parkingAssisteSensors);
//		System.out.println("Car.display()");
//	}
	public String toString() {
		return super.toString()+
				"\nPower Steering = "+hasPowerSteering+
				"\nDrive Mode = "+drivemode+
				"\nParking Assister Sensors = "+parkingAssisteSensors;
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
	
//	void display()
//	{
//		super.display();
//		System.out.println("Capacity of Passenger seats : "+this.passCap);
//		System.out.println("Capacity of Passengers to stand : "+this.standCap);
//		System.out.println();
	//}
	
	public String toString() {
		return super.toString()+
				"\nCapacity of Passengeers seats : "+passCap+
				"\nCapacity of Passengers to stand :"+standCap;
	}
	 void brake() {
	        System.out.println("Vehicle bus applies air brakes.");
	    }
}//bus ends here

public class Vehicles {
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle(1 , "Sedan" , "TATA" , 4 , 4000000);
		System.out.println(v1);
		v1.brake();
		System.out.println();
		
		v1 = new Bike(2 , "Platinum" ,"TVS " , 2 , 2000000 , 2 , 2 , "Sports" );
		System.out.println(v1);
		v1.brake();
		System.out.println();
		
		v1 = new Car(3 ,"Virtus","Wolkswagen",4 ,15000000 ,0,0,"none","Yes","Automatic","Eight");
		System.out.println(v1);
		v1.brake();
		System.out.println();
		
		v1 =new Bus(4 , "Volvo 9400" , " Volvo" , 6  , 4500000.0 , 0 , 0 , "None" , "Yes" , "Mannual", "Eight" , 50 , 20);
		System.out.println(v1);
		v1.brake();
		System.out.println();
	}

}


------------------------------------------Sports ---------------------------------------------
package NewMethods;


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
	
//	void display()
//	{
//		System.out.println("Name : "+this.name);
//		System.out.println("Age : "+this.age);
//		System.out.println("Country : "+this.Country);
//		System.out.println("Matches PLayed : "+this.matchesPlayed);
//		System.out.println("Jersy Number : "+this.jersynum);
//	}	
	
	public String toString() {
		return "Name = "+name+
				"\nAge = "+age+
				"\nCountry = "+Country+
				"\nMatches Played = "+matchesPlayed+
				"\nJersy Number = "+jersynum;
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
//	void display()
//	{
//		super.display();
//		
//	}
	public String toString() {
		return super.toString();
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
	
//	void display()
//	{
//		super.display();
//		System.out.println("Total Goals : "+this.totalGoals);
//		System.out.println("Playing Position : "+this.playingPosition);
//	}
//	
	public String toString()
	{
		return super.toString()+
				"\nTotal Goals = "+totalGoals+
				"\nPlaying Position = "+playingPosition;
	}
}

public class Sporty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1;

	    p1 = new Cricket("A", 30, "Brazil", 12, 1, 5000, 800, "Good", "Best");
	    System.out.println(p1.toString());
	    p1.play();
	    System.out.println("----------------");

	    p1 = new Football("B", 20, "Australia", 3, 6, 78, "Central");
	    System.out.println(p1.toString());
	    p1.play();
	    System.out.println("----------------");

	    System.out.println("Total Players are : " + Player.getCount());
	

	}

}

-----------------------------------------Employee ----------------------------------------------
package NewMethods;


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
	
	public String toString()
	{
		return "Employee id = "+id + 
				"\nEmployee Name : "+name+
				"\nEmployee Salary : "+salary;
	}
	
//	void display()
//	{
//		System.out.println("Emoplyee id : "+this.id);
//		System.out.println("Employee name : "+this.name);
//		System.out.println("Employee Salary : "+this.salary);
//			}
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
	
//	void display()
//	{
//		super.display();
//		System.out.println("Allowance = "+this.allowance);
//		System.out.println("Total Salary is : "+(salary + allowance));
//
//	}
	double calsal()
	{
		return salary+allowance;
	}

	
	public String toString() {
		return super.toString()+
		 "\nAllowance=" + allowance + 
				"\n Total Salary = "+calsal();
	}
	
	
	
}//class ends
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
		
		
//		void display()
//		{
//			super.display();
//			System.out.println("The incentive is : "+this.incentive);
//			System.out.println("The Target is : "+this.target);
//			System.out.println("Total Salary = " + (salary + incentive));
//		}
		double calsal()
		{
			return salary+incentive;
		}
		public String toString()
		{
			return super.toString()+
					"\nIncentive = "+incentive +
					"\nTarget = "+ target+
					"\nTotal Salary = "+calsal();
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
		
//		void display()
//		{
//			System.out.println("The Commission is : "+this.commission);
//		
//		}
		double calsal()
		{
			return salary+commission;
		}

		public String toString()
		{
			return super.toString()+
					"\nCommission : "+ commission +
					"\nTotal Salary : "+calsal();
					
					
		}
		
	}
	
public class Emp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe e1 = new Employe(1,"Gauravi", 500000); 
//		e1.display();
//		System.out.println("Calculated Salary is : "+e1.calsal());
//		System.out.println();
		System.out.println(e1.toString());
		System.out.println();
		
		e1 = new Admin(2, "Anushka", 700000 ,6000);//upcasting done
//		e1.display();
//		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println(e1.toString());
		System.out.println();
		
		e1 = new SalesManager(3 , "Dhiraj", 60000,  3000.0 , 40000.0);//upcasting done
//		e1.display();
//		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println(e1.toString());
		System.out.println();
		

		e1 = new HR (4, "Saujanyaa" ,60000, 800, 7000, 60000,90000);//upcasting done
//		e1.display();
//		System.out.println("Calculated Salary is : "+e1.calsal());
		System.out.println(e1);
		System.out.println();
		
		// here are the changes here is done upcasting 
		
		System.out.println();
		
		Employe.getCount();
		System.out.println("Total count of Employeea are : "+Employe.getCount());
			

	}

}

------------------------------------------ Shape ------------------------------------------------
package NewMethods;


class Shape1
{
	int area;
	
	Shape1()
	{
		this.area = 0;
		
	}
	Shape1(int area)
	{
		this.area  = area;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
	double calculateArea()
	{
		return 0;
	}
	@Override
	public String toString()
	{
	    return "Area = " + area;
	}
}//shape

class Circle extends Shape1
{
    int radius;

    Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Radius = " + radius;
    }

    @Override
    double calculateArea()
    {
        return 3.14 * radius * radius;
    }
}//class circle ends here

class Triangle extends Shape1
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
//	void display()
//	{
//		super.display();
//	
//		System.out.println("Base : "+this.base);
//		System.out.println("Height : "+this.height);
//		
//		
//	}
	@Override
	public String toString()
	{
	    return super.toString() +
	           "\nBase = " + base +
	           "\nHeight = " + height;
	}
	double calculateArea()
	{
		return 0.5 * base * height;
	}
	
}//triangle ends
class Rectangle extends Shape1
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
//	void display()
//	{
//	
//		System.out.println("Length : "+this.length);
//		System.out.println("Breadth : "+this.breadth);
//		
//	}
	
	public String toString() {
		return super.toString()+
				"\nLength : "+length+
				"\nBreadth : "+breadth;
	}
	double calculateArea()
	{
		return length * breadth;
	}
}//rectangle ends here
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape1 s1;
		
		s1 = new Circle(23);
		System.out.println(s1);
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		s1 = new Triangle(30 , 20 , 12);
		System.out.println(s1);
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		s1 = new Rectangle(200, 20, 10);
		System.out.println(s1);
		System.out.println("Area = "+s1.calculateArea());
		System.out.println("----------------");
		
		
		
	}


	}

------------------------------------------ Student ----------------------------------------------
package NewMethods;

class Students
 {
	int frn;
	String name;
	double distanceCovered;
	static int count;
	static
	{
		count =0;
	}
	
	Students()
	{
		this.frn = 0;
		this.name = "Not given";
		this.distanceCovered = 0;
		count++;
	}
	
	Students(int frn , String name , double distanceCovered)
	{
		this.frn = frn;
		this.name = name;
		this.distanceCovered = distanceCovered;
		count++;
	}
	
	int getfrn()
	{
		return frn;
	}
	
	void setfrn(int frn)
	{
		this.frn = frn;
	}

	String getname()
	{
		return name;
	}
	void setname(String name)
	{
		this.name = name;
	}
	
	double getdistanceCovered()
	{
		return distanceCovered;
	}
	
	void setdistanceCovered(double distanceCovered)
	{
		this.distanceCovered = distanceCovered;
	}
	
	
	 static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Students.count = count;
	}

	@Override
	public String toString() {
		return "Student frn = "+frn+
				"\nStudent name = "+name+
				"\nDistance covered = "+distanceCovered;
	}

//	void display()
//	{
//		System.out.println("FRN : "+this.frn);
//		System.out.println("Student Name : "+this.name);
//		System.out.println("Distance covered : "+this.distanceCovered);
//		System.out.println();
//	}
	//class Students ends here
}	
class PlacedStudents extends Students { //step 1 : Is-a relationship "extends" keyword
	//step 2 : remove attributes which are already in super class 
	//otherwise we will rewrite
	String Companyname;
	String designation;
	
	PlacedStudents()
	{
		super();
		//this.frn = 0;
		//this.name = "Not given";
		//this.distanceCovered = 0;
		this.Companyname = "Not Given";
		this.designation = " Not Given yet";
	}
	
	PlacedStudents(int frn, String name , double distanceCovered , String Companyname, String designation)
	{
		super(frn,name,distanceCovered);
		//this.frn = frn;
		//this.name = name;
		//this.distanceCovered = distanceCovered;
		this.Companyname = Companyname;
		this.designation = designation;
	}

	

	 String getCompanyname() {
		return Companyname;
	}

	 void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	 String getDesignation() {
		return designation;
	}

	 void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString()
	{
		return super.toString()+
				"\nCompany Name : "+Companyname+
				"\nDesignation : "+designation;
	}
	
//	void display()
//	{
//		super.display();
//		//System.out.println("FRN : "+this.frn);
//		//System.out.println("Student Name : "+this.name);
//		//System.out.println("Distance covered : "+this.distanceCovered);
//		System.out.println("Company Name : "+this.Companyname);
//		System.out.println("Designation : "+this.designation);
//		System.out.println();
//	}
	//class PlacedStudents ends here
}

		


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1;
		
		 s1 = new Students(1,"Gauravi",200);
		 System.out.println(s1.toString());
		 System.out.println();
		 
		 
		 s1 = new Students(2, "Siddharth" , 300);
		 System.out.println(s1.toString());
		 System.out.println();
		//Students s3 = new Students(3, "Santosh Shinde", 500);
		//Students s4 = new Students(4,"Harsh" , 600 );
		s1 = new PlacedStudents(3,"Santosh Shinde",500 , "Deloitee","Programming Manager");
		System.out.println(s1.toString());
		System.out.println();
		
		s1 = new PlacedStudents(4,"Harsh" , 600 , "Wipro", " Backend Developer");
		System.out.println(s1.toString());
		System.out.println();
		
		Students.getCount();
		
		
		
		
		System.out.println("Total Count of Students = "+Students.getCount());
		
		

	}

  }



	


