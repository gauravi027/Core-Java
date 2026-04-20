class Admin
{
       int id;
       String name;
       int salary;
       double allowance;

       void setid ( int id )
       {
            this.id = id ;

       }
            void setname( String name )
       {
            this.name = name ;

       }

       void setsalary( int salary )
       {
            this.salary = salary;

       }
       void setallowance( double allowance )
       {
            this.allowance = allowance;

       }



}//class admin ends here

class TestAdmin
{
       public static void main(String args[])
       {
              
              Admin a1 = new Admin();


              System.out.println("---------------Before Assigning--------------");
              System.out.println("The id of Sales Manager is : " + a1.id);
              System.out.println("The name of Sales Manager is : " + a1.name);
              System.out.println("The Salary of Sales Manager is : " + a1.salary);
              System.out.println("The Allowance of Sales Manager is : " + a1.allowance);

              //Assigning work
              a1.setid(121);
              a1.setname("Siddharth");
              a1.setsalary(1000000);
              a1.setallowance(12.500);

              System.out.println("---------------After Assigning--------------");
              System.out.println("The id of Sales Manager is : " + a1.id);
              System.out.println("The name of Sales Manager is : " + a1.name);
              System.out.println("The Salary of Sales Manager is : " + a1.salary);
              System.out.println("The Allowance of Sales Manager is : " + a1.allowance);


       }
}