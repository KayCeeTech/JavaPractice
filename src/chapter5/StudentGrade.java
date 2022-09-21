package chapter5;
   import java.util.Scanner;
  public class StudentGrade {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          String name = " ";
          int counterGrade = 1;
          int total = 0;

          int count1 = 0;
          int count2 = 0;
          int count3 = 0;
          int count4 = 0;
          int count5 = 0;

          System.out.printf("%n%n  Enter an integer grade from range 1-5: ");
          for (int grade = 1; grade <= 5; grade++) {
              int letterGrade = input.nextInt();
              total += grade;
              ++counterGrade;

              switch (grade / 5) {
                  case 5:
                      ++count1;
                      break;

                  case 4:
                      ++count2;
                      break;

                  case 3:
                      ++count3;
                      break;

                  case 2:
                      ++count4;
                      break;
                  default:
                  case 1:
                      ++count5;
                      break;


              }
          }
          System.out.printf("%n", counterGrade,total);
          System.out.printf("%n", "A:", count1,
                  "B:", count2,
                  "C:", count3,
                  "A:", count4,
                  "B:", count5);
      }
  }
