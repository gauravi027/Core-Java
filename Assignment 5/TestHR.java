class HR
{
    int id;
    String name;
    int salary;
    int commission;

}// class HR ends here

class TestHR
{
      public static void main(String args[])
      {
            HR h1;
            h1 = new HR();
            System.out.println(h1);

            System.out.println("-------------Before Assigning------------");
            System.out.println("The HR id is : " + h1.id);
            System.out.println("The HR name is : " + h1.name);
            System.out.println("The HR Salary is : " + h1.salary);
            System.out.println("The HR commission is : " + h1.commission);

            //Assigning values
            h1.id = 101;
            h1.name = "Siddharth" ;
            h1.salary = 40000;
            h1.commission = 4000;

            System.out.println("------------- After Assignning-----------");
            System.out.println("The HR id is : " + h1.id);
            System.out.println("The HR name is : " + h1.name);
            System.out.println("The HR Salary is : " + h1.salary);
            System.out.println("The HR commission is : " + h1.commission);


      }
}