

   import java.util.Scanner;
  public class AccountTest{
   public static void main(String[] args){
     
      Account myAccount1 = new Account("kelvin clark", 100.20);
      Account myAccount2 = new Account("micheal jack", -50.38);

      System.out.printf("%s balance: $%.2f%n",  myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s Balance: $%.2f%n%n",  myAccount2.getName(), myAccount2.getBalance());

      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for myAccount1: ");
      double depositMoney = input.nextDouble();
      System.out.printf("%nadding %.2f to myAccount1 Balance%n%n", depositMoney);
      myAccount1.setBalance(depositMoney);

      System.out.printf("%s Balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s Balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

      
      System.out.print("Enter deposit Amount for myAccount2: ");
      depositMoney = input.nextDouble();
      System.out.printf("%nadding %.2f to myAccount2 Balance%n%n", depositMoney);
      myAccount2.setBalance(depositMoney);



      System.out.printf("%s Balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s Balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

      System.out.print("Enter the Amount that You want to withdraw from Micheal Jack Account: ");
      double withDrawalAmount = input.nextDouble();
      System.out.printf("%nWithDrawal of %.2f from Micheal Jack Account ",  withDrawalAmount);
      myAccount2.withDrawal(withDrawalAmount);
      System.out.printf("%n%s%n balance: %.2f", myAccount2.getName(), myAccount2.getBalance());


      
   }
  }