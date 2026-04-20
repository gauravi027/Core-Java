class HR
{
    int id;
    String name;
    int salary;
    int commission;


    void setId( int id ) 
    {
         this.id = id ; 

    }
    void setName( String name ) 
    {
         this.name = name ; 

    }

    void setSalary( int salary ) 
    {
         this.salary = salary ; 

    }

    void setCommission( int commission ) 
    {
         this.commission = commission ; 

    }


}// class HR ends here

class TestHR
{
      public static void main(String args[])
      {
           
            HR h1 = new HR();
            HR h2 = new HR();

            

            //Assigning values
            h1.setId(101);
            h1.setName("Siddharth") ;
            h1.setSalary(40000);
            h1.setCommission(4000);

            System.out.println("------------- first Assignning-----------");
            System.out.println("The HR id is : " + h1.id);
            System.out.println("The HR name is : " + h1.name);
            System.out.println("The HR Salary is : " + h1.salary);
            System.out.println("The HR commission is : " + h1.commission);



            h2.setId(102);
            h2.setName("Gauravi") ;
            h2.setSalary(40000);
            h2.setCommission(4000);

            System.out.println("------------- second  Assignning-----------");
            System.out.println("The HR id is : " + h2.id);
            System.out.println("The HR name is : " + h2.name);
            System.out.println("The HR Salary is : " + h2.salary);
            System.out.println("The HR commission is : " + h2.commission);


      }
}