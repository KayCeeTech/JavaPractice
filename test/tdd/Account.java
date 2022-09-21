package tdd;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if (balance > 0) {
            balance = balance + amount;
        }
    }

     public void setBalance(int balance){

        this.balance = balance;
     }
     public int getBalance() {
        return balance;
    }
    public void withDraw(int amount){
        if(amount <= balance) {
            balance = balance - amount;

        }
    }



}
