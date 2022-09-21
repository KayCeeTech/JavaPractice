package Chapter7;
   import java.security.SecureRandom;
  public class DieRolling {
      public static void main(String[] args){
          SecureRandom randomNumbers = new SecureRandom();

          //int[] array = {53,74,32,9,38,19,20,30,50,90};
          int[] frequency = new int[7];
          for(int roll = 1; roll < 600; roll++){
              ++frequency[1 + randomNumbers.nextInt(6)];
          }
          System.out.printf("%s%10s%n", "Face", "Frequency");

          for (int face = 1; face < frequency.length; face++){
              System.out.printf("%4d%10s%n", face, frequency[face]);
          }
      }
  }
