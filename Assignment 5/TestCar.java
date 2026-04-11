class Car
{
      String Brand;
      double price;
      String model;

}//class car ends here

class TestCar
{ 

      public static void main(String args[])
      {
           Car c1;
           c1 = new Car();
           System.out.println(c1);

           System.out.println("--------Before Assigning -----------");
           System.out.println("The Brand name of car is : " + c1.Brand);
           System.out.println("The Price of car is : " + c1.price);
           System.out.println("The model of car is : " + c1.model);


      //Assigning
           c1.Brand = "TATA";
           c1.price = 230000;
           c1.model = "Punch";

           System.out.println("--------After Assigning -----------");
           System.out.println("The Brand name of car is : " + c1.Brand);
           System.out.println("The Price of car is : " + c1.price);
           System.out.println("The model of car is : " + c1.model);

      }

}
