package chapter5;
 import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.print("Enter a prime number: ");
        number = input.nextInt();

        while (number <= 10){
            if(number % 2 ==0)
            System.out.printf("%d is prime number%n:  ",number);
            number++;
        }
        System.out.println();
    }
}
