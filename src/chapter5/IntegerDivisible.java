package chapter5;
  import java.util.Scanner;
  public class IntegerDivisible {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int total = 0;
          //int counter = 1;

              for( int counter = 1; counter <= 30; counter++){
                  total += counter;
                  if(counter % 3 == 0){
                      System.out.printf("%d ", counter);
                  }
              }
              System.out.printf("%n%nThe Sum is: %d%n", total);

      }
  }
