package chapter4;

 import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
           System.out.print("Enter your Grade: ");
           int grade = input.nextInt();
           total = total + grade;
           gradeCounter = gradeCounter + 1;
        }
        int average = total / 10;
        System.out.printf("%n Display total of 10: %d%n", total);
        System.out.printf(" Display your Average: %d%n", average);
    }
}
