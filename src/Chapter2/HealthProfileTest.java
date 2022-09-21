  package Chapter2;
  import Chapter3.DateOfBirth;

  import java.util.Scanner;

   public class HealthProfileTest {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          HealthProfile myHealthRecord = new HealthProfile(" ", " ", " ", new DateOfBirth("05","10","1990"));

         myHealthRecord.targetHeartRate1();


          System.out.println("PLEASE, Enter your first name: ");
          String name = input.nextLine();
          myHealthRecord.setFirstName(name);
          System.out.printf("Person's name is: %s%n",myHealthRecord.getFirstName());
          System.out.println();

          System.out.println("Enter your last name: ");
          String lastName = input.nextLine();
          myHealthRecord.setLastName(lastName);
          System.out.printf("Person's name is: %s%n",myHealthRecord.getLastName());
          System.out.println();

          System.out.println("Enter your gender: "+ " " );
          String gender = input.nextLine();
          myHealthRecord.setGender(gender);
          System.out.printf("The Person's gender is: %s%n",myHealthRecord.getGender());
          System.out.println();






      }
   }


