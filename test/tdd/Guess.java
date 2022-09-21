package tdd;
 import java.util.Scanner;
 public class Guess {
    public static void main(String[] args) {
        // int numbers = 25;
        Scanner input = new Scanner(System.in);
        //public void guessNumber ( int numbers){
            System.out.print("Guess Three numbers right, between 19, 20 and 21: ");
            int number = input.nextInt();
            switch (number){
                case  20:
                    System.out.println("PERFECT: "+ number);
                    break;
                case  19:
                    System.out.println("LOW: " + number);
                    break;

                case 21:
                    System.out.println("HIGH: " + number);
            }
           /* if (number == 25) {
                System.out.printf("PERFECT: %n%s", number);
            } else if (number < 25) {
                System.out.printf("LOW :%s%n", number);

            } else {
                System.out.printf("HIGH: %S%n",number);
            }*/


            /*for ( int numbers = 0; numbers <= 3; numbers ++) {
                  System.out.printf("%n number" + "");
            }
            int count1 = 1;
            while (count1 <= 10){
                System.out.print(count1 + "");
                count1 += 1;
            }

            int count2 = 0;
            while (count2 <= 10){
                System.out.print(count2 + "");
                count2 = count2 - 2;
            }

            // using for Loop:
            for(int count3 = 0; count3 <= 10; count3 ++){
                if(count3 % 2 == 0){
                    System.out.print(count3 + "");
                }
            }*/

        //}
    }

}
