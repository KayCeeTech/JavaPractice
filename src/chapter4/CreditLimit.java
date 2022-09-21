package chapter4;
 import java.util.Scanner;
  public class CreditLimit {

     private int accountNumber = 0;
     private int balanceAtBeginning = 0;



    public CreditLimit (int accountNumber, int balanceAtBeginning){
        this.accountNumber = accountNumber;

        if(balanceAtBeginning < 0){
            this.balanceAtBeginning = balanceAtBeginning;
        }
    }
    public void totalCharge(double totalAmount){
        if(totalAmount == 0){
            totalAmount = totalAmount + 1;
        }
    }
    public  void totalCredit(double totalCreditApplied){
        if(totalCreditApplied <= 0){
            System.out.println("Credit Limit Exceeded");
        }
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setBalanceAtBeginning(int balanceAtBeginning){
        this.balanceAtBeginning = balanceAtBeginning;
    }

      public int getBalanceAtBeginning() {
          return balanceAtBeginning;
      }
  }
