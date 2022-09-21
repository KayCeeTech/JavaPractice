package Chapter2;

import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.println("Enter first integer: ");
   int num1 = input.nextInt();

   System.out.println("Enter second integer: ");
   int num2 = input.nextInt();

   int square = num1 * num2;
   System.out.printf("square of the integer is: %d%n ",square);

   //Method Two
//   System.out.println("Enter your first integer: ");
//   double number = input.nextDouble();
//
//   double square = Math.pow(number,2);
//   System.out.println("Square of " + number + "  is:" + square );
  }

 }
