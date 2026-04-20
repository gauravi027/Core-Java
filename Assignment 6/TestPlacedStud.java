class PlacedStudent {
    int frn;
    String studentName;
    double distanceCovered;
    String companyName;
    String designation;

    void setFrn( int frn )
    {
         this.frn = frn;
    }
    void setStudentName( String studentName )
    {
         this.studentName = studentName;
    }
    void setDistanceCovered( int distanceCovered )
    {
         this.distanceCovered = distanceCovered;
    }
    void setCompanyName( String companyName )
    {
         this.companyName = companyName;
    }
    void setDesignation( String designation )
    {
         this.designation = designation;
    }

}

class TestPlacedStud {
    public static void main(String[] args) {

        PlacedStudent s1 = new PlacedStudent(); 

        
        System.out.println("----------first Assignment -------------");

        s1.setFrn(1001);
        s1.setStudentName("Siddharth");
        s1.setDistanceCovered(23);
        s1.setCompanyName("LTM Mindtree");
        s1.setDesignation("Head of Prog. Manager");


        System.out.println("---------- After Assignment -------------");
        System.out.println("FRN: " + s1.frn);
        System.out.println("Name: " +  s1.studentName);
        System.out.println("Distance: " +  s1.distanceCovered);
        System.out.println("Company: " +  s1.companyName);
        System.out.println("Designation: " +  s1.designation);


    }
}