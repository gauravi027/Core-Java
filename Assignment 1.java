# Assignment 1 - Java Basic Programs

## Question 1: Addition of Two Numbers

```java
package assignment1;

public class Question1 {
    
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.printf("Addition is %d",c);
    }

}
```

---

## Question 2: Check Even or Odd

```java
package assignment1;

public class Question2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int no= 10;
        if(no%2==0)
            System.out.printf("Number is even");
        else
            System.out.printf("Number is odd");
        
        

    }

}
```

---

## Question 3: Check Palindrome Number

```java
package assignment1;


public class Question3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int no = 122221;
        int res=ispallindrome(no);
        if(res==1)
            System.out.printf("number is pallindrome");
        else
            System.out.printf("Number is not a pallindrome");
    }
    
    static int ispallindrome(int no)
    {
        //logic
        return 1;
    }

}
```

---

## Question 4: Area of Rectangle

```java
package assignment1;

public class Question4 {
    
    public static void main (String args[])
    {
        int length=20;
        int width=30;
        int area=2 * (length + width);
        System.out.printf("The area is %d",area);
    }

}
```

---

## Question 5: Area of Triangle

```java
package assignment1;

public class Question5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int height=10;
        int base=30;
        double area = 0.5 * base * height;
        System.out.printf("Area of triangle is %.2f", area);

    }

}
```

---

## Question 6: Total Marks and Percentage

```java
package assignment1;

public class Question6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int sub1=10;
        int sub2=20;
        int sub3=30;
        int sub4=40;
        int sub5=50;
        
        int totalmarks= sub1+sub2+sub3+sub4+sub5;
        System.out.printf("Total marks are: %d", totalmarks);
        
        double percentage= totalmarks / 5.0;
        System.out.printf("Percentage is: %.2f", percentage);
        

    }

}
```

---

## Question 7: Square and Cube of a Number

```java
package assignment1;

public class Question7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=2;
        int square=n*n;
        System.out.printf("Square of number n is: %d\n",square);
        
        int cube=n*n*n;
        System.out.printf("Cube of the number n is:%d",cube);
        

    }

}
```

---

## Question 8: Average of Five Numbers

```java
package assignment1;

public class Question8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1=10;
        int n2=20;
        int n3=30;
        int n4=40;
        int n5=50;
        
        int avg= (n1+n2+n3+n4+n5) / 5;
        
        System.out.printf("Numbers are:\n  %d\n  %d\n  %d\n  %d\n  %d%n\n", n1, n2, n3, n4, n5);
        
        System.out.printf("The average of numbers will be: %d", avg);

    }

}
```

---

## Question 9: Celsius to Fahrenheit Conversion

```java
package assignment1;

public class Question9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double celcius=25;
        
        System.out.printf("The celcius to be converted is: %.2f\n",celcius);
        
        double farhanite=(9.0/5) * celcius + 32;
        System.out.printf("Temperature after converting celcius into farhanite will be : %.2f ",farhanite);

    }

}
```

---

## Question 10: Time Conversion (Hours and Minutes)

```java
package assignment1;

public class Question10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int hours = 3;
        int minutes=hours * 60;
        
        System.out.printf("Hours : %d\n",hours);
        System.out.printf("hours in minutes are : %d\n", minutes);
        
        int min=180;
        double hrs= min / 60.0;
        
        System.out.printf("minutes are : %d\n", min);
        System.out.printf("Minutes in hours are : %.2f\n", hrs);
        
        

    }

}
```

---

## 📌 Assignment Summary

This assignment includes basic Java programs.

