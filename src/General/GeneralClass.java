package General;

import java.util.Scanner;

public class GeneralClass {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      // Solving for Maximum Number
      System.out.print("Enter a floating number space it in three places: ");
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();

      double result = maximum(number1, number2, number3);
      System.out.println("Maximum is: " + result);
    }
    public static double maximum(double x, double y, double z){
      double maximumValue = x;

      if(y > maximumValue){
        maximumValue = y;
      }
      if(z > maximumValue){
        maximumValue = z;
      }

      return maximumValue;
    }
  }
