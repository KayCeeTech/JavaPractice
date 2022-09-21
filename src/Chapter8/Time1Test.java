package Chapter8;

import java.util.Scanner;

public class Time1Test {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          Time1 time = new Time1();

          displayTime("After Time object is created",time);
          System.out.println();

          time.setTime(13,27,6);
          displayTime("After calling setTime", time);
          System.out.println();

          try {
              time.setTime(99,99,99);
          }
          catch (IllegalCallerException e){
              System.out.printf("Exception: %s%n%n",e.getMessage());
          }
          displayTime("After calling setTime with invalid value",time);
      }
      private static void displayTime(String header, Time1 time1){
          System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                  header, time1.toUniversalString(), time1.toString());

      }
  }
