package Chapter2;

import Chapter3.DateOfBirth;

import java.util.Scanner;

public class HealthProfile {

    private String firstName;
      private  String lastName;
      private  String gender;
      private DateOfBirth dob;

      private  int mhr1 = 0;



       //Constructor1
      public HealthProfile(String firstName, String lastName, String gender, DateOfBirth dateOfBirth) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.gender = gender;
      }

    //method set first name.
      public void setFirstName(String firstName){
          this.firstName = firstName;
      }
      //method get first name
      public String getFirstName(){
          return firstName;
      }
      //Method set Last name
      public void setLastName(String lastName){
          this.lastName = lastName;
      }
      //Method get Last Name.
      public String getLastName(){
          return lastName;
      }
      //Method set gender.
      public void setGender(String gender){
          this.gender = gender;
      }
      //Method get gender
      public String getGender(){
          return gender;
      }
      //Method set date of birth


    public void maxHeartRate1(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        int age1 = input.nextInt();
         mhr1 = 220 - age1;
        System.out.printf("Your Heart Rate is %d%n: ", age1);

      }
      public int getMaxHeartRate(){
          Scanner input = new Scanner(System.in);
          System.out.println();
          int age1 = input.nextInt();
          mhr1 = 220 - age1;
          System.out.printf("Your Heart Rate is %d%n: ", age1);
          return mhr1;

      }


      public  void targetHeartRate1(){
          maxHeartRate1();
          double range1 = 0.5 * mhr1;
          double range2 = 0.85 * mhr1;
          System.out.println("Your maximum heart Rate Range is" + range1 + "-"+ range2);

      }







  }
