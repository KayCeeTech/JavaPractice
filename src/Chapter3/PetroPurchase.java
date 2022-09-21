package Chapter3;

import java.util.Scanner;

public class PetroPurchase {

       private String sabo;
       private  String gasoline;
       private int quantity;
       private  double price;
       private double discount;
       private double netPurchase = 0;


       public PetroPurchase(String sabo, String gasoline){
           this.sabo = sabo;
           this.gasoline = gasoline;
       }

       public String getSabo() {
           return sabo;
       }

       public void setSabo(String sabo) {
           this.sabo = sabo;
       }
       public  void  getPurchaseAmount(){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your price: ");
           double netPurchase = input.nextDouble();
           netPurchase = quantity * price - discount;
       }
   }
