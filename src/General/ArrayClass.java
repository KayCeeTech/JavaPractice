package General;

import java.util.Scanner;

public class ArrayClass {

    //Array is a collection of items of the same types.
    //Example: a crate of eggs, a crate of minerals;
    //It has a fixed length.
    //Index or Indexes.
   // int[] numbers = new int[5];
//    numbers[0] =2;
//    numbers[4] =5;
//    numbers[1] = 8;
//    numbers[2] =10;
//    numbers[3] = 7;
    //for(int index = 0; index < numbers.length; index++){
        //System.out.println(numbers[index]);
    //}


      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

//          int [] array = {10,20,30,40,50,60,70,80,90,100};
//          System.out.printf("%s%9s%n","Index", "Value");
//
//          for(int counter = 0; counter < array.length; counter++){
//              System.out.printf("%4d%6d%n", counter, array[counter]);
//          }

//          final int NUMBER = 10;
//          int[] array = new int[NUMBER];
//
//          for(int counter = 0; counter < array.length; counter++){
//              array[counter] = 2 + 2 *  counter; // counter count from right to left.
//          }
//          System.out.printf("%s%8s%n", "Index", "Value");
//
//          for(int counter = 0; counter < array.length; counter++){
//              System.out.printf("%4d%9d%n", counter,array[counter]);
//
//          }

          /*String[] color = {"black", "Red", "Green", "Orange", " Gold", "Grey", "White"};
          System.out.printf("%5s%9s%n", "Index","Elements");

          for (int index = 0; index < color.length; index++){
              System.out.printf("%5s%9s%n", index, color[index]);
          }*/

//          String[] color1 = new String[7];
//          color1[0] = "White";
//          color1[1] = "Black";
//          color1[2] = "Green";
//          color1[3] = "Red";
//          color1[4] = "Pink";
//          color1[5] = "Orange";
//          color1[6] = "Purple";
//           for(int index = 0; index < color1.length; index++)
//
//          System.out.println(color1[index]);

          //Array Sum
          //ASSIGNMENT:
          int[] array = {32,54,19,59,53,20,50,70,59,80};
          int sum = 0;
          for (int counter = 0; counter < array.length; counter++){
               sum += array[counter];
          }
          System.out.println();
          System.out.println("The sum of the array is: "+ sum);
      }

  }
