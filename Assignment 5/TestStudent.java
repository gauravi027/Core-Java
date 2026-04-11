class Student
{
      int frn;
      String studentName;
      double distanceCovered;

}//class student ends here

class TestStudent
{
      public static void main(String args[])
      {
          Student s1;//referrence
          s1 = new Student();//object creation
          System.out.println(s1);
          
          System.out.println("------------Before Assignment--------------");
          System.out.println("Name of the student is : " + s1.studentName);
          s1.studentName = "Gauravi";
          System.out.println("FRN number of the student is : " + s1.frn);
          s1.frn = 1201;
          System.out.println("Distance covered by the student is : " + s1.distanceCovered);
          s1.distanceCovered = 12.05;


          System.out.println("------------After Assignment--------------");
          System.out.println("Name of the student is : " + s1.studentName);
          System.out.println("FRN number of the student is : " + s1.frn);
          System.out.println("Distance covered by the student is : " + s1.distanceCovered);
      }
      
}