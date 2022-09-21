package chapter5;
   import java.util.Scanner;
  public class NumberPattern {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

         /* int row = 5;

           while (row >= 1) {
               int column = 5;

               while (column >= 1) {
                   System.out.print(row % 2 == 0 ? "X" : "O");
                   ++column;
                   } // end while

               --row;
               System.out.println();
          }*/

          /*int count = 1;
          while (count <= 20){
              System.out.println(count % 3 == 1 ? "######" : "++++++++");
              count++;
          }*/

           int x = 0;
           int total = 0;

           while (x <= 10) {
               int y = x + 1;
               x++;
               total += y;
               System.out.printf("Y is: %d and total is %d\t", y, total);
               }
      }

  }
