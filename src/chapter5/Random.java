package chapter5;
  import java.util.Scanner;
  public class Random {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

          long  result = 0;
          System.out.print("Guess a number: ");
          result = input.nextLong();
          for (long number =0; number <= 2; number++){
              if(result == 51 ){
                  System.out.printf("%d Your guessing is correct!: ", result);
              }
               else if ((result > number) && (result < number)) {
                  System.out.printf("%d Too High!: ",result);

              }
              else {
                  System.out.printf("%d Too Low!: ", result);
              }

              System.out.println();
          }


      }
  }
