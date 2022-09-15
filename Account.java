

    public class Account{
        private String name;
        private double balance;
      

   public Account(String name, double balance){ // A constructor name.
     this.name = name;
   
     if(balance > 0.0){
       this.balance = balance;
     }
   }

   public void setBalance(double  depositMoney){
     if(depositMoney > 0.0){
       balance = balance + depositMoney;
     }
   }

   public void withDrawal(double  withDrawAmount){
     if(withDrawAmount > balance){
        System.out.println("Exceeded Account Balance: ");
     } else{
       balance = balance - withDrawAmount;
     }
   }   

   public double getBalance(){
     return balance;
   }
 
   public void setName(String name){
     this.name = name;
   }

   public String getName(){
     return name;
   }
 }
    