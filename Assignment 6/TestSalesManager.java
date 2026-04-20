class SalesManager
{
       int id;
       String name;
       int salary;
       double incentive;
       int target;

       void setid ( int id ) 
       {
            this.id = id ;
       }
       void setname ( String name ) 
       {
            this.name = name ;
       }
       void setsalary ( int salary ) 
       {
            this.salary = salary ;
       }
       void setincentive ( double incentive ) 
       {
            this.incentive = incentive ;
       }
       void settarget ( int target ) 
       {
            this.target = target ;
       }

}//class SalesManager ends here 

class TestSalesManager
{    
          public static void main(String args[])
          {

                SalesManager s1 = new SalesManager();


               

                //assigning values
                s1.setid(121);
                s1.setname("Siddharth");
                s1.setsalary(50000);
                s1.setincentive(450.000);
                s1.settarget(2000000);

                System.out.println("---------------After Assigning--------------");
                System.out.println("The id of Sales Manager is : " + s1.id);
                System.out.println("The name of Sales Manager is : " + s1.name);
                System.out.println("The Salary of Sales Manager is : " + s1.salary);
                System.out.println("The incentive given to Sales Manager is : " + s1.incentive);
                System.out.println("The Target given to Sales Manager is : " + s1.target);


                
          }
}