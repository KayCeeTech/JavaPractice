package General;
  import  java.util.Scanner;
 public class IphoneTest {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         Iphone iphone1 = new Iphone("White", 350.0);
         System.out.printf("%s price %.2f%n", Iphone.getColor(), Iphone.getPrice());

         Iphone iphone2 = new Iphone("Black", 300.0);
         System.out.printf("%s price %.2f%n", Iphone.getColor(), Iphone.getPrice());
     }
 }
