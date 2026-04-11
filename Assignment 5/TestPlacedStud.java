class PlacedStudent {
    int frn;
    String studentName;
    double distanceCovered;
    String companyName;
    String designation;
}

class TestPlacedStud {
    public static void main(String args[]) {

        PlacedStudent s1 = new PlacedStudent(); 

        System.out.println(s1);

        System.out.println("---------- Before Assignment -------------");
        System.out.println("FRN: " + s1.frn);
        System.out.println("Name: " + s1.studentName);
        System.out.println("Distance: " + s1.distanceCovered);
        System.out.println("Company: " + s1.companyName);
        System.out.println("Designation: " + s1.designation);

        System.out.println("---------- Assignment -------------");

        s1.frn = 1001;
        s1.studentName = "Siddharth";
        s1.distanceCovered = 23.2;
        s1.companyName = "LTM Mindtree";
        s1.designation = "Head of Prog. Manager";


        System.out.println("---------- After Assignment -------------");
        System.out.println("FRN: " + s1.frn);
        System.out.println("Name: " + s1.studentName);
        System.out.println("Distance: " + s1.distanceCovered);
        System.out.println("Company: " + s1.companyName);
        System.out.println("Designation: " + s1.designation);


    }
}