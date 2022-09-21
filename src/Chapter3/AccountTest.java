package Chapter3;
 import java.util.Scanner;
  public class AccountTest {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

          Account account1 = new Account("Pelumi Fasasi", 20.0);
          Account account2 = new Account(" Cosmos Victorial",-0.0);

          System.out.printf("%s balance: #%.2f%n", account1.getName(), account1.getBalance());
          System.out.printf("%s balance: #%.2f%n",account2.getName(), account2.getBalance());

          System.out.print("Enter your deposit Amount: ");
          double depositAmount = input.nextDouble();
          System.out.printf("%n Adding %.2f%n to your deposit Amount", depositAmount);
          account1.deposit(depositAmount); // Add to account1's balance.
          System.out.println();

          System.out.print("Make your withdrawal: ");
          double withdrawalAmount = input.nextDouble();
          System.out.printf("%n Withdraw your Money %.2f%n Thank you! ",withdrawalAmount);
          account2.withdraw(withdrawalAmount);
          System.out.println();

          System.out.print("Make your withdrawal: ");
           withdrawalAmount = input.nextDouble();
          System.out.printf("%n Withdraw your Money %.2f%n Thank you! ",withdrawalAmount);
          account1.withdraw(withdrawalAmount);


      }
  }
