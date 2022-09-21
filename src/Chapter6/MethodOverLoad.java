package Chapter6;

public class MethodOverLoad {

      public static void main(String[] args) {

          System.out.printf("square of number is: %d%n" , square(7));
          System.out.printf("square of number is :%f%n ", square(7.5));
      }

      public static int square(int intValue){
          System.out.printf("%ncall the square of the number %d%n", intValue);
          return intValue * intValue;
      }

      public static double square(double doubleValue){
          System.out.printf("%nCall the square of the double number %f%n", doubleValue);
          return doubleValue * doubleValue;
      }
  }
