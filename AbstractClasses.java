---------------------------------------Insurance Policy ---------------------------------------
package Abstract;

import java.util.Scanner;

abstract class InsurancePolicy {
    String policyHolderName;
    double basePremium;

    InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    abstract double calculatePremium();

    void printPolicyDetails() {
        System.out.println("Policy Holder Name : " + policyHolderName);
        System.out.println("Base Premium       : " + basePremium);
        System.out.println("Total Premium      : " + calculatePremium());
    }
}

// -------------------- Car Insurance --------------------

class CarInsurance extends InsurancePolicy {

    int carAge;
    boolean hadAccident;
    double carValue;

    CarInsurance(String policyHolderName, double basePremium,
                 int carAge, boolean hadAccident, double carValue) {

        super(policyHolderName, basePremium);
        this.carAge = carAge;
        this.hadAccident = hadAccident;
        this.carValue = carValue;
    }

    @Override
    double calculatePremium() {

        double totalPremium = basePremium;

        // Age Loading
        if (carAge <= 3) {
            totalPremium += basePremium * 0.10;
        } else if (carAge <= 7) {
            totalPremium += basePremium * 0.20;
        } else {
            totalPremium += basePremium * 0.30;
        }

        // Accident Loading / No Claim Discount
        if (hadAccident) {
            totalPremium += basePremium * 0.25;
        } else {
            totalPremium -= basePremium * 0.10;
        }

        // Luxury Car Charge
        if (carValue > 1000000) {
            totalPremium += 2000;
        }

        return totalPremium;
    }
}

// -------------------- Health Insurance --------------------

class HealthInsurance extends InsurancePolicy {

    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;

    HealthInsurance(String policyHolderName, double basePremium,
                    int age, boolean isSmoker,
                    boolean hasPreExistingDisease) {

        super(policyHolderName, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    @Override
    double calculatePremium() {

        double totalPremium = basePremium;

        // Age Loading
        if (age <= 30) {
            totalPremium += basePremium * 0.10;
        } else if (age <= 45) {
            totalPremium += basePremium * 0.20;
        } else {
            totalPremium += basePremium * 0.30;
        }

        // Smoker
        if (isSmoker) {
            totalPremium += basePremium * 0.30;
        } else {
            totalPremium -= basePremium * 0.05;
        }

        // Disease
        if (hasPreExistingDisease) {
            totalPremium += basePremium * 0.20;
        }

        return totalPremium;
    }
}

// -------------------- Main Class --------------------

public class InsurancePremiumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nCustomer " + i);

            System.out.println("1. Car Insurance");
            System.out.println("2. Health Insurance");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Enter Policy Holder Name: ");
            String policyHolderName = sc.nextLine();

            System.out.print("Enter Base Premium: ");
            double basePremium = sc.nextDouble();

            InsurancePolicy policy;

            if (choice == 1) {

                System.out.print("Enter Car Age (Years): ");
                int carAge = sc.nextInt();

                System.out.print("Had Accident in Last Year (true/false): ");
                boolean hadAccident = sc.nextBoolean();

                System.out.print("Enter Car Value: ");
                double carValue = sc.nextDouble();

                policy = new CarInsurance(
                        policyHolderName,
                        basePremium,
                        carAge,
                        hadAccident,
                        carValue);

            } else {

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Are you Smoker? (true/false): ");
                boolean isSmoker = sc.nextBoolean();

                System.out.print("Pre-existing Disease? (true/false): ");
                boolean disease = sc.nextBoolean();

                policy = new HealthInsurance(
                        policyHolderName,
                        basePremium,
                        age,
                        isSmoker,
                        disease);
            }

            System.out.println("\n----- Policy Details -----");
            policy.printPolicyDetails();
      }

        sc.close();
    }
}     

---------------------------------Electricy Bill --------------------------------------------
package Abstract;

import java.util.Scanner;

abstract class Electricitybill
{
	String cname;
	int units;
	
	Electricitybill(String cname , int units){
		this.cname = cname;
		this.units = units;	
	}
	
	void showusage() {
		System.out.println("Customer name = "+this.cname);
		System.out.println("Units consumed = "+this.units);
	}
	
	abstract double calculateBill();
	
	final void generatebill()
	{
		double bill = calculateBill();
		bill = bill + (bill * 0.05); //add 5% tax
		bill = bill + 50;//add fixed charge
		System.out.println("Final bill Amount is Rs . "+bill);
	}
}

class ResidentialBill extends Electricitybill{
	ResidentialBill(String cname , int units)
	{
		super(cname , units);
	}
	double bill = 0;
	double calculateBill() {
		if (units >= 100)
		{
			bill = units*2.5;
		}
		else

			if(units >= 300)
			{
				bill = (100 * 2.5) + ((units - 100) * 3.5);
			}
			else
			{
				bill = (100*2.5)+(100*3.5)+((units - 300)*5);
			}
		return bill;
	}
	
	
}// ends here

class CommercialBill extends Electricitybill
{
	double bill;
	CommercialBill(String cname , int units)
	{
		super(cname , units);
	}
	double unit = 0;
	double calculateBill() 
	{
		if(units < 200 && bill < 1500)
		{
			bill = 1500;
		}
		if(units > 1000)
		{
			bill = bill +(bill*0.8);
		}
		return bill;
	}
	
}

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of customers = ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			System.out.println("\nCustomer  = "+ i);
			System.out.println("1 . Residential ");
			System.out.println("2 . Commercial ");
			System.out.println("Enter choice = ");
			int choice = sc.nextInt();
			
		

		
		System.out.println("Customer name is = ");
		String cname = sc.next();
		
		System.out.println("Units consumed = ");
		int units = sc.nextInt();
		
		Electricitybill e;

		    if(choice == 1)
		    {
		        e = new ResidentialBill(cname, units);
		    }
		    else
		    {
		        e = new CommercialBill(cname, units);
		    }
		
		e.showusage();
		e.generatebill();
		
		
		}
		sc.close();
	}
	
}


-------------------------------------- Online Payment ---------------------------------------
package Abstract;



abstract class Payment{
	int paymentId;
	int amt;
	String payerName;
	String status;
	
	
	Payment(int paymentId ,int amt , String payerName , String status )
	{
		this.paymentId = paymentId;
		this.amt = amt;
		this.payerName = payerName;
		this.status = status;
	}
	
	void printSummar() {
		System.out.println("Payement id = "+this.paymentId);
		System.out.println("Payment Amount = "+this.amt);
		System.out.println("Payer's Name = "+this.payerName);
		System.out.println("Payment Status = "+this.status);
		
	}
	final void process()
	{
		if(validate())
		{
			deductAmount();
			sendNotification();
			status = "SUCCESS";
		}
		else
		{
			status ="FAILED";
		}
	}
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
}//ends here 

class CardPayment extends Payment{
	String cardnum;
	String cvv;
	
	CardPayment( int paymentId ,int amt , String payerName , String cardnum , String cvv)
	{
		super(paymentId, amt ,payerName , "PENDING");
		this.cardnum=cardnum;
		this.cvv= cvv;
	}	
		boolean validate()
		{
			if(cardnum.length() == 16 && cvv.length() == 3 && amt > 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
		void deductAmount()
		{
			System.out.println("Amount deducted from card");
			
		}
		void sendNotification()
		{
			System.out.println("Notification sent to customer");
		}
	
}//ends here 

class UPI extends Payment{
	String upiId;
	
	UPI(int paymentId ,int amt , String payerName ,  String upiId)
	{
		super(paymentId,amt,payerName,"PENDING");
		this.upiId = upiId;
	}
	
	boolean validate() {
		if(upiId.contains("@") && 
				amt>=1 && amt<=100000)
		{
			System.out.println("UPI Validation Successfully done");
			return true;
		}
		else {
			return false;
		}
	}
	void deductAmount()
	{
		System.out.println("Amount "+amt+" deducted Successfully");
		
	}
	
	void sendNotification()
	{
		System.out.println("Notification sent successfully");
	}
}

public class OnlinePaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1;
		
		p1 = new CardPayment(101, 5000, "Gauravi ", "1234567824354654557" , "123"  );
		p1.process();
		p1.printSummar();
		
		System.out.println("-----------------------------------------------------------");
		
		p1 = new UPI(102 , 3000 , "Siddharth" , "rahul@hskdj"  );
		p1.process();
		p1.printSummar();
		System.out.println("-----------------------------------------------------------");
		
		
		p1 =new UPI(104,150000,"Sneha","sneh@aupi");
		p1.process();
		p1.printSummar();
		System.out.println("------------------------------------------------------------");
	}

}
