package Chapter7;

import java.util.Scanner;

public class EnhanceForLoop {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

//          int total = 0;
//          int[] array = {23,12,45,27,30,81,73};
//          for (int count  : array){
//              total += count;
//          }
//          System.out.printf("Total is: %d%n ", total);


          //Passing Array
          int[] array = {1,2,3,4,5,6,7,8,9,10};
          System.out.printf("Effects of passing reference to entire array:%n and "+
                  "The value of the Original array are:%n");
          for (int value : array){
            System.out.printf("%d%n",value);

          }
          modifyArray(array);
          System.out.printf("%n%n The value of the modify arrays are:%n ");
          for (int value : array ){
              System.out.printf("  %d%n",value);
          }
          System.out.printf("%n%n Effect of passing Array Element value %n " +
                  "array[3] before modifyElement: %d%n%n",array[3]);
          modifyElement(array[3]);
          System.out.printf("%n The effect after modifying: %d%n%n",array[3]);

      }
      public static void modifyArray(int[] array2){
          for (int counter = 0; counter < array2.length; counter++){
              array2[counter] *= 2;
          }
      }
      public static void modifyElement(int element){
          element *= 2;

          System.out.printf("The value of Element in modifying :%d%n", element);
      }
  }
