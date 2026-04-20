class BankAccount
{  
       int accountNumber;
       String holderName;
       int currentBalance;
       int interestRate;

       void setaccountNumber ( int accountNumber )
       { 
            this.accountNumber = accountNumber;
       }
       void setholderName ( String holderName )
       { 
            this.holderName = holderName;
       }
       void setcurrentBalance ( int currentBalance )
       { 
            this.currentBalance = currentBalance;
       }
       void setinterestRate ( int interestRate )
       { 
            this.interestRate = interestRate;
       }

}//Class BankAccount ends here

class TestBankAccount
{
          public static void main(String args[])
          {
                  BankAccount b1;
                  b1 = new BankAccount();
                 

                  System.out.println("---------------Before Assigning--------------");
                  System.out.println("The Account Number is : " + b1.accountNumber);
                  System.out.println("The name of Account Holder is : " + b1.holderName);
                  System.out.println("The Current Balance of Account is : " + b1.currentBalance);
                  System.out.println("The Interest Rate of account is : " + b1.interestRate);

                  // assigning process 
                  b1.setaccountNumber(12345678);
                  b1.setholderName("Sidsaccount"); 
                  b1.setcurrentBalance(124544);
                  b1.setinterestRate(34445);

                  System.out.println("---------------After Assigning--------------");
                  System.out.println("The Account Number is : " + b1.accountNumber);
                  System.out.println("The name of Account Holder is : " + b1.holderName);
                  System.out.println("The Current Balance of Account is : " + b1.currentBalance);
                  System.out.println("The Interest Rate of account is : " + b1.interestRate);

                  

          }
}