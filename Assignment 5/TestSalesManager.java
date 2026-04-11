class SalesManager
{
       int id;
       String name;
       int salary;
       double incentive;
       int target;
}//class SalesManager ends here 

class TestSalesManager
{    
          public static void main(String args[])
          {
                SalesManager s1;
                s1 = new SalesManager();
                System.out.println(s1);

                System.out.println("---------------Before Assigning--------------");
                System.out.println("The id of Sales Manager is : " + s1.id);
                System.out.println("The name of Sales Manager is : " + s1.name);
                System.out.println("The Salary of Sales Manager is : " + s1.salary);
                System.out.println("The incentive given to Sales Manager is : " + s1.incentive);
                System.out.println("The Target given to Sales Manager is : " + s1.target);

                //assigning values
                s1.id = 121;
                s1.name = "Siddharth";
                s1.salary = 50000;
                s1.incentive = 450.000;
                s1.target = 2000000;

                System.out.println("---------------After Assigning--------------");
                System.out.println("The id of Sales Manager is : " + s1.id);
                System.out.println("The name of Sales Manager is : " + s1.name);
                System.out.println("The Salary of Sales Manager is : " + s1.salary);
                System.out.println("The incentive given to Sales Manager is : " + s1.incentive);
                System.out.println("The Target given to Sales Manager is : " + s1.target);


                
          }
}