package chapter5;
   import  java.util.Scanner;
  public class Fact {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

          int count = 1;
          long sum = 1;
          long factorial = 1;
          System.out.println("Enter any number: " );
          sum = input.nextLong();
          while (count <= sum){
              factorial *= count;
              count++;
          }
          System.out.printf("Factorial of your input:%d = %d: ", sum, factorial );



//           int  total = 0;
//           double principal = 100.0;
//           double rate = 0.05;
//           System.out.printf("%s%20s%n", "year","amount of deposit");
//           for (int year = 1; year <= 10; year++){
//               double amount = principal * Math.pow(1.0 + rate, year);
//               System.out.printf("%d4%,20.2f%n", year, amount);
           //}
      }
  }
