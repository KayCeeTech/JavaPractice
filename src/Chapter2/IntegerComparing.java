package Chapter2;

import java.util.Scanner;

public class IntegerComparing {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter one integer: ");
         int num = input.nextInt();

         int square = num * 2;
         if(num == square){
             System.out.printf("%d == %d%n", num, square);
         }
         if(num > square){
             System.out.printf("%d > %d%n",num, square);
         }
         if(num < square){
             System.out.printf("%d < %d%n", num, square);
         }
         if(num != square){
             System.out.printf("%d != %d%n", num, square);
         }

     }
 }
