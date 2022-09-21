package Chapter3;

import java.util.Scanner;
  public class HeartRates {

      private  String firstName;
      private  String lastName;
      private DateOfBirth dob;
      private  int mhr = 0;

      public String getFirstName() {
          return firstName;
      }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMhr() {
        return mhr;
    }

    public void setMhr(int mhr) {
        this.mhr = mhr;
    }

    public void setFirstName(String firstName) {
          this.firstName = firstName;
      }


      public void setDob(DateOfBirth dob){
          this.dob = dob;
      }

      public  DateOfBirth  getDob(){
          return dob;
      }

      public HeartRates (String firstName, String lastName, DateOfBirth dob){
          this.firstName = firstName;
          this.lastName = lastName;
          this.dob = dob;
      }
       // Create a method to calculate Maximum heart Rate.
      public void maxHeartRate(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please , Could you kindly input your age: ");
          int age = scanner.nextInt();
          mhr = 220 - age;
          System.out.println(getFirstName().toUpperCase() + ", your maximum heart Rate is: " + mhr + "bpm");
      }

      public void  targetHeartRateRange(){  //Method to calculate target heart Rate Range.
          maxHeartRate();
          double range1 = 0.5 * mhr;
          double range2 = 0.85 * mhr;
          System.out.println(getFirstName().toUpperCase() + " , Your target Heart rate is in the range: "+ range1 + "-"+ range2 + "bmp");
      }



  }
