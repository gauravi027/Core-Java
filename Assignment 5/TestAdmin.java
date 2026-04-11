class Admin
{
       int id;
       String name;
       int salary;
       double allowance;

}//class admin ends here

class TestAdmin
{
       public static void main(String args[])
       {
              Admin a1;
              a1 = new Admin();
              System.out.println(a1);

              System.out.println("---------------Before Assigning--------------");
              System.out.println("The id of Sales Manager is : " + a1.id);
              System.out.println("The name of Sales Manager is : " + a1.name);
              System.out.println("The Salary of Sales Manager is : " + a1.salary);
              System.out.println("The Allowance of Sales Manager is : " + a1.allowance);

              //Assigning work
              a1.id = 121;
              a1.name = "Siddharth";
              a1.salary = 1000000;
              a1.allowance = 12.500;

              System.out.println("---------------After Assigning--------------");
              System.out.println("The id of Sales Manager is : " + a1.id);
              System.out.println("The name of Sales Manager is : " + a1.name);
              System.out.println("The Salary of Sales Manager is : " + a1.salary);
              System.out.println("The Allowance of Sales Manager is : " + a1.allowance);


       }
}