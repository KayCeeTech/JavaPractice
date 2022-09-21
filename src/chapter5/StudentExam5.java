package chapter5;

 import java.util.Scanner;
  public class StudentExam5 {
      public static void main(String[] args){
          /*int total = 0;

          for(int number = 2; number <= 20; number ++){
              total = total + number;
          }
         System.out.printf("SUM is: %d%n ", total);*/

          // COMPOUND INTEREST
          // A = P(1 + R)^n Where P = 1000.0, R = 0.05 of rate, N = 10 years
          double principal = 1000.0;
          double rate = 0.05;
          System.out.printf("%s%20s%n", "Year", "Amount on deposit");

          for(int year = 1; year <= 10; year ++){
              double amount = principal * Math.pow(1.0 +  rate,  year);
              System.out.printf("%4d%,20.2f%n", year, amount);
          }
      }
  }
