package Chapter7;

import java.util.Scanner;

public class GradeBookTest {
      public static void main(String[] args){

          Scanner input = new Scanner(System.in);

          int [] gradesArray = {12,34,25,15,35,71,55,60};

          GradeBook myGradeBook = new GradeBook("Introduction to Java",gradesArray);
          System.out.printf("Welcome to the grade book for%n%s%n%n",myGradeBook.getCourseName());
          myGradeBook.processGrade();
      }
  }
