/*
package chapter5;

  import java.awt.desktop.SystemEventListener;
  import java.util.Scanner;

  public class AutoPolicyQ {
      private int accountNumber;
      private  String makeModel;
      private  String state;

      public AutoPolicyQ(int accountNumber, String makeModel, String state){
          this.accountNumber = accountNumber;
          this.makeModel = makeModel;
          this.state = state;
      }
      public  void setAccountNumber(int accountNumber){
          this.accountNumber = accountNumber;
      }
      public int getAccountNumber(){
          return accountNumber;
      }
      public void setMakeModel(String makeModel){
          this.makeModel = makeModel;
      }
      public String getMakeModel(){
          return makeModel;
      }
      public void setState(String state){
          this.state = state;
      }
      public String getState(){
          if(getState == MA || ME ){
              System.out.println("Display an error message");
          }
          return state;
      }

      public boolean isNoFaultState(){
          boolean noFaultState;

          switch (getState()){

              case "CT": case "MA": case "ME": case "NH": case  "NJ": case "NY": case "PA": case "VT":
                  noFaultState = true;
                  break;
              default:
                  noFaultState = false;
                  break;
          }
          return noFaultState;
      }



  }
*/
