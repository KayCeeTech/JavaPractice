package Chapter7;
  import java.util.Scanner;
  public class ArrayGeneral {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

//          int[] array = {20,38,47,98,34,94,28,75,63,100};
//              System.out.printf("%s%20s%n", "Index", "Value");
//          for (int counter = 0; counter < array.length; counter++){
//              System.out.printf("%3d%20d%n",counter, array[counter]);
//          }


          /*
         // How to solve for a constant value using final.
               final int ARRAY_LENGTH = 10;
               int[] array = new int[ARRAY_LENGTH];
           for(int counter = 0; counter < array.length; counter++){
               array[counter] = 2 + 2 * counter;
           }
               System.out.printf("%s%8s%n", "index", "value");

           for(int counter = 0; counter < array.length; counter++){
               System.out.printf("%5d%8d%n", counter, array[counter]);
           }*/


          //How to solve for Sum of numbers using Array
          /*   int[] array = {32,76,19,20,64,35,85,39,75};
               int total = 0;
          for (int counter = 0; counter < array.length; counter++){
               total = total + array[counter];
           }
               System.out.printf("Total is: %d%n ", total);*/



          //Statistic. ./;
//          int[] array = {0,0,0,0,0,0,1,2,1,2,1};
//          System.out.println("Grade distribution: ");
//
//          for(int counter = 0; counter < array.length; counter++){
//              if(counter == 10){
//                  System.out.printf("%5d: ", 100);
//              }
//              else {
//                  System.out.printf("%02d-%02d ",counter * 10, counter * 10 + 9);
//              }
//              for (int stars = 0; stars < array[counter]; stars++){
//                  System.out.printf("*");
//
//              }
//              System.out.println();
//          }

            //Student pull
          /*int[] responses = {1,2,4,3,5,1,2,3,5,4,1,2,3,5,4,1,2,3,14};
          int[] frequency = new int[6];
          for (int answer = 0; answer < responses.length; answer++){
              try {
                  ++frequency[responses[answer]];
              }
              catch (ArrayIndexOutOfBoundsException e){
                  System.out.println(e);
                  System.out.printf("  responses[%d] = %d%n%n", answer, responses[answer]);
              }
          }
            System.out.printf("%4d%10d%n", "Rating", "Frequency");

          for (int rating = 0; rating < frequency.length; rating++){
              System.out.printf("%4d%10d%n", rating, frequency[rating]);
          }
*/
      }

  }
