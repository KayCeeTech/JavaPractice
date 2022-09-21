package General;

 public class Iphone {
         private static String color;
         private  static double price;

         public Iphone (String color,  double price){
             Iphone.color = color;
             Iphone.price = price;
         }

         public static void setPrice(double price){
             Iphone.price = price;
         }
         public static double getPrice(){
             return price;
         }

         public static void setColor(String color){
             Iphone.color = color;
         }
         public static String getColor(){
             return color;
         }


 }
