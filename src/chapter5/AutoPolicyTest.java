  package chapter5;
   import java.util.Scanner;
  public class AutoPolicyTest {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

            AutoPolicy policy1 = new AutoPolicy(365354, "BMW", "KANO");
            AutoPolicy policy2 = new AutoPolicy(11111134, "J-WAGON", "JOS");


          policyInNoFaultState(policy1);
          policyInNoFaultState(policy2);

      }
      public static void policyInNoFaultState(AutoPolicy policy){System.out.println("The Auto policy: ");
          System.out.printf("Account #: %d; Car: %s; %nState %s %S A No Fault State%n%n",
                  policy.getAccountNumber(),
                  policy.getMakeAndModel(), policy.getState(),
                  (policy.isNoFaultState() ? "is" : "is not "));


      }
  }
