class Date
{
    int day,month,year;
    String dow;

}//class date ends here(write for ur understanding)


class TestDate
{
    //can create many public classes 
    public static void main1(String args[])
    {
          Date d2;//referrence
          d2 = new Date(); //new is mandatory keyword in java
          System.out.println(d2);
    }

    public static void main(String args[])
{
    Date d1; // reference
    d1 = new Date(); // object creation

    System.out.println(d1);

    System.out.println("Today's date is : " + d1.day + "/" + d1.month + "/" + d1.year);
    System.out.println("Day of week is : " + d1.dow);

    d1.day = 6;
    d1.month = 2;
    d1.year = 2026;
    d1.dow = "Friday";

    System.out.println("Today's date is : " + d1.day + "/" + d1.month + "/" + d1.year);
    System.out.println("Day of week is : " + d1.dow);
}