package chapter5;
 import java.util.Random;
 import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // While Loop!
        /*int number = 0;
        while (number <= 10){
           System.out.printf("%d%nTen numbers:", number);
           number++;

        }*/
        // For Loop!
        /*for(int i = 0; i <= 10; ++i ){
            System.out.printf("%d%nRepeat Ten times:", i);
        }*/

       /* for(int j = 2; j <= 80; j += 5){
            System.out.printf("%d%n", j);
        }*/

        /*for(int i = 20; i >= 2; i -= 2){
            System.out.printf("%d%n", i);
        }*/

       /* for(int j = 2; j <= 12; j += 2){
            System.out.printf("%d%n", j);
        }*/

        /*int total = 0;

        for (int i = 2; i <= 20; i += 2){
            total += i;

        }
        System.out.printf(" Sum is:%d%n", total );
 */

        /*int counter = 1;
        do{
            System.out.printf("%d ", counter);
            counter ++;
        }while (counter <= 10);
        System.out.println();*/

        int total = 0;
        int counterGrade = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        while (input.hasNext()){
            System.out.printf("%s%nEnter Your Grade between the range of 0-100, Type <ctrl>z to end ");
            int grade = input.nextInt();
            total = total + grade;
            counterGrade ++;

            switch (grade / 10){
                case 9:
                case 10:
                    aCount ++;
                    break;

                case  8:
                    bCount ++;
                    break;

                case 7:
                    cCount ++;
                    break;

                case 6:
                    dCount ++;
                    break;

                default:
                    fCount ++;
                    break;

            }

        }
        System.out.printf("%d%nGrade Reports: %s");

        if(counterGrade != 0){
            double average = (double) total/ counterGrade;
            System.out.printf("%n%d", counterGrade, total);
            System.out.printf("%.2f%n",average);
            System.out.printf("%n%d%s", "A:",aCount,"B:",bCount, "C:",cCount, "D:",dCount, "F",fCount);
        }
        else {
            System.out.println("No grade were entered!");
        }



    }
}
