class Student
{
      int frn;
      String studentName;
      double distanceCovered;
     
      void setfrn ( int frn )
      {
            this.frn = frn ;
      }
      void setstudentName ( String studentName )
      {
            this.studentName = studentName ;
      }

      void setdistanceCovered ( double distanceCovered )
      {
            this.distanceCovered = distanceCovered ;
      }


}//class student ends here

class TestStudent
{
      public static void main(String args[])
      {
         
          Student s1 = new Student();//object creation
         
          s1.setstudentName("Gauravi");
          s1.setfrn(1201);
          s1.setdistanceCovered(12.05);


          System.out.println("------------After Assignment--------------");
          System.out.println("Name of the student is : " + s1.studentName);
          System.out.println("FRN number of the student is : " + s1.frn);
          System.out.println("Distance covered by the student is : " + s1.distanceCovered);
      }
      
}