class Book
{
     int bookId;
     String bookName;
     int bookPrice;
     
}// Class book ends hefre

class TestBook
{
     public static void main(String args[])
     {
         Book b1;
         b1 = new Book();
         System.out.println(b1);
         
         System.out.println("------------------Before Assigning ---------------------");
         System.out.println("The id of book is : " + b1.bookId);
         System.out.println("The id of book is : " + b1.bookId);
         System.out.println("The id of book is : " + b1.bookId);

         //Assign
         b1.bookId = 1234;
         b1.bookName = "Alexander";
         b1.bookPrice = 3400;

         System.out.println("------------------Before Assigning ---------------------");
         System.out.println("The id of book is : " + b1.bookId);
         System.out.println("The id of book is : " + b1.bookId);
         System.out.println("The id of book is : " + b1.bookId);

     }
}