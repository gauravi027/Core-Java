class Date
{
   int date,month,year;
   String dow;

void setDate( int d)
{
    this.date = d;
}

void setMonth( int m )
{
    this.month = m;
}

void setYear( int y )
{
    this.year = y;
}

void setDow( String d )
{
    this.dow = d;
}

}//class date ends here(write for ur understanding)


class TestDate
{
    public static void main(String args[])
    {
         Date d1 = new Date();
         Date d2 = new Date();
         Date d3 = new Date();
         

         //d1.day = 9 ;  
         //instead of this line we can write 
         
         d1.setDate(9);
         d1.setMonth(2);
         d1.setYear(2026);
         d1.setDow("Monday");

         System.out.println(d1.dow + " " + d1.date + "/" + d1.month + "/" + d1.year);

         d2.setDate(10);
         d2.setMonth(2);
         d2.setYear(2026);
         d2.setDow("Tuesday");

         System.out.println(d2.dow + " " + d2.date + "/" + d2.month + "/" + d2.year);


         d3.setDate(11);
         d3.setMonth(2);
         d3.setYear(2026);
         d3.setDow("Wednesday");

         System.out.println(d3.dow + " " + d3.date + "/" + d3.month + "/" + d3.year);




    }  
}