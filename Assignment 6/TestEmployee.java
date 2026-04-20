class Employee
{
     int id;
     int salary;
     String name;

void setId( int id )
{
     this.id = id;
}
void setSalary( int salary )
{
     this.salary = salary;
}
void setName( String name )
{
     this.name = name;
}

}// class employee ends here

class TestEmployee
{
      public static void main(String args[])
      {
        
         Employee t1 = new Employee();
         Employee t2 = new Employee();
         Employee t3 = new Employee();
       
       

         t1.setId(101);
         t1.setName("Siddharth");
         t1.setSalary(4000000);        

         System.out.println("The Id of Employee is : " + t1.id);
         System.out.println("The name of the Employee is : " + t1.name);
         System.out.println("The salary of the employee is : " + t1.salary);


         t2.setId(102);
         t2.setName("Gauravi");
         t2.setSalary(4000000);        

         System.out.println("---------Second entryyyy---------");


         System.out.println("The Id of Employee is : " + t2.id);
         System.out.println("The name of the Employee is : " + t2.name);
         System.out.println("The salary of the employee is : " + t2.salary);

         t3.setId(103);
         t3.setName("Yashashree");
         t3.setSalary(4000000);        

         System.out.println("---------thirdd entryyyy---------");


         System.out.println("The Id of Employee is : " + t3.id);
         System.out.println("The name of the Employee is : " + t3.name);
         System.out.println("The salary of the employee is : " + t3.salary);


      }
}