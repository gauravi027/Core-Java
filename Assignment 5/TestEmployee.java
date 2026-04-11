class Employee
{
     int id;
     int salary;
     String name;
}// class employee ends here

class TestEmployee
{
      public static void main(String args[])
      {
         Employee t1;
         t1 = new Employee();
         System.out.println(t1);

         System.out.println("------------Before Assignment---------------------");
         System.out.println("The Id of Employee is : " + t1.id);
         System.out.println("The name of the Employee is : " + t1.name);
         System.out.println("The salary of the employee is : " + t1.salary);
         


         System.out.println("------------Assignment--------------------");
         t1.id = 101;
         t1.name = "Siddharth";
         t1.salary  = 4000000;        


         System.out.println("------------After Assignment---------------------");         
         System.out.println("The Id of Employee is : " + t1.id);
         System.out.println("The name of the Employee is : " + t1.name);
         System.out.println("The salary of the employee is : " + t1.salary);



      }
}