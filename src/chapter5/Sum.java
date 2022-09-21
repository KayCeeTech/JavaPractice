package chapter5;
 import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 1;
        while (count <= 30){
          int sum = count + 1;
          count ++;
          total += sum;
          System.out.printf("N is: %d    Sum is: %d\n",sum, total);
        }

       /* int count = 1;
        long num = 1;
        long factorial = 1;
        System.out.printf("Enter any number %d = %d",num,factorial);
         num = input.nextLong();
        while(count <= num){

            factorial *= count;
            count++;

        }
        System.out.printf("%d = %d", num, factorial);
*/

    }
}
