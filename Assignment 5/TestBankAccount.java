class BankAccount
{  
       int accountNumber;
       String holderName;
       int currentBalance;
       int interestRate;
}//Class BankAccount ends here

class TestBankAccount
{
          public static void main(String args[])
          {
                  BankAccount b1;
                  b1 = new BankAccount();
                  System.out.println(b1);

                  System.out.println("---------------Before Assigning--------------");
                  System.out.println("The Account Number is : " + b1.accountNumber);
                  System.out.println("The name of Account Holder is : " + b1.holderName);
                  System.out.println("The Current Balance of Account is : " + b1.currentBalance);
                  System.out.println("The Interest Rate of account is : " + b1.interestRate);

                  // assigning process 
                  b1.accountNumber = 1234567890;
                  b1.holderName = "Sidsaccount" ; 
                  b1.currentBalance = 12454454;
                  b1.interestRate = 34445;

                  System.out.println("---------------After Assigning--------------");
                  System.out.println("The Account Number is : " + b1.accountNumber);
                  System.out.println("The name of Account Holder is : " + b1.holderName);
                  System.out.println("The Current Balance of Account is : " + b1.currentBalance);
                  System.out.println("The Interest Rate of account is : " + b1.interestRate);

                  

          }
}