package General;
 import java.util.Random;
 import java.util.Scanner;
 public class Grade {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int total = 0;
         int gradeCounter = 1;
         System.out.print("Enter your grade or -1 to quit: ");
         int grade =  input.nextInt();

         while (grade != -1){
             total = total + grade;
             gradeCounter += 1;
             System.out.print("Enter the next grade: ");
             grade = input.nextInt();
         }
         if(gradeCounter != 0){
             double average = (double) total / gradeCounter;

             System.out.printf("%d Total gradeCounter  is: %d%n",gradeCounter,total);

             System.out.printf("Average value is: %.2f%n ",average);
         }
         else{
             System.out.println("No grade were found: ");
         }
     }
 }
