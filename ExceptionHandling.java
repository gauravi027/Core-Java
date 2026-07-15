----------------------------------------------------- invalid age ------------------------------------------------------------
package p2;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(){
		super("Age must be above 18.");
	}
}
    public class Demo{
    	int age;
    	
    	Demo(int age ){
    		this.age = age;
    	}

	void validate() {
		if(this.age < 18) {
			try {
				throw new InvalidAgeException();
				}catch(InvalidAgeException iae) {
					System.out.println(iae);
				}
		}else {
			System.out.println("You are eligible to vote!!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo v =  new Demo(12);
		v.validate();

	}

}


------------------------------------------------------- Employee ---------------------------------------------------------------------------
package Abstract;

class SalaryException extends Exception{
	SalaryException(){
		super("Salary should be greater than 10000");
	}
}

public class Employee {
	int salary;
	
	Employee(int salary){
		this.salary = salary;
	}
	
	void chechSalary() {
		if(salary < 10000) {
			try {
				throw new SalaryException();
			}catch(SalaryException se) {
				System.out.println("Salary should be greater than 10000");
			}
		}
		else {
			System.out.println("Salary is Noted");
		}
	}



public static void main(String[] args) {
	Employee e1 = new Employee(1000);
	e1.chechSalary();
  }
}


----------------------------------------------------- OTP -----------------------------------------------------------------------
package Abstract;

class InvalidOTPException extends Exception {

    InvalidOTPException() {
        super("OTP must be of 6 digits.");
    }

    InvalidOTPException(String message) {
        super(message);
    }
}

public class OTP {

    String num;

    OTP(String num) {
        this.num = num;
    }

    void validate() {

        try {

            // Check OTP length
            if (num.length() != 6) {
                throw new InvalidOTPException("OTP must be exactly 6 digits.");
            }

            // Check if OTP contains only digits
            if (!num.matches("\\d{6}")) {
                throw new InvalidOTPException("OTP should contain only numbers.");
            }

            // If both conditions are satisfied
            System.out.println("OTP Verified Successfully.");

        } catch (InvalidOTPException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void main(String[] args) {

        OTP o1 = new OTP("123456");
        o1.validate();

        OTP o2 = new OTP("12345");
        o2.validate();

        OTP o3 = new OTP("1234567");
        o3.validate();

        OTP o4 = new OTP("12AB56");
        o4.validate();

        OTP o5 = new OTP("ABCDEF");
        o5.validate();
    }
}


--------------------------------------------------------------- Student ------------------------------------------------------------------------------------
package Abstract;

class InvalidMarksException extends Exception{
	InvalidMarksException(){
		super("Marks should range between 0 to 100");
	}
}
public class Student {
	int marks;
	
	Student(int marks){
		this.marks = marks;
	}
	
	void checkMarks() {
		if(marks < 0 || marks >  100) {
			try {
				throw new InvalidMarksException();
			}catch(InvalidMarksException me) {
				System.out.println("Incorrect marks are entered");
			}
		} else {
			System.out.println("Marks are noted!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(10);
		s.checkMarks();

	}

}


-------------------------------------------------------- Liscense -------------------------------------------------------------------------
package Abstract;

class InvalidLicenseException extends Exception {
	InvalidLicenseException(){
		super("Age must be 18 or above");
	}
}
public class License {
	int age;
	
	License(int age){
		this.age = age;
	}
	
	void Validate() {
		if(age < 18) {
			try {
				throw new InvalidLicenseException();
			} catch (InvalidLicenseException e) {
				System.out.println("Age for Liscense is 18+");
			}
		}else {
			System.out.println("Congragulations! You are eligible for applying to liscense system");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		License e = new License(19);
		e.Validate();

	}

}
