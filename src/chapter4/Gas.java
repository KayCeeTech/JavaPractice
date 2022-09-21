package chapter4;
 import java.util.Scanner;
   public class Gas {
       public static void main(String[] args){
           Scanner input = new Scanner(System.in);

           int mile = 0;
           int gallon = 0;
           System.out.print("Enter a number of Miles or -1 to quit: ");
           int number = input.nextInt();

           while (number != -1){
               mile = mile + number;
               gallon = gallon + 1;

               System.out.print("Enter a number of Miles or -1 to quit: ");
               number = input.nextInt();
           }
           if(gallon != 0){
               double average = (double) mile /gallon;
               System.out.printf("%n Total number of the %d Miles drove is:%d%n", gallon, mile);
               System.out.printf("Average Miles is: %.2f%n",average);
           }
           else {
               System.out.println("No miles were started");
           }
       }
   }
