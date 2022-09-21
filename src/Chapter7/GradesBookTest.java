package Chapter7;

import java.util.Scanner;

public class GradesBookTest {
     public static  void main(String[] args){

         Scanner input = new Scanner(System.in);

         int[][] gradesArray = {{58,47,90},{12,49,29,50},
                 {35,44,56},{61,31,75},{13,42,60},{51,15,86},{76,23,19},
                 {84,90,100},{49,30,20},{52,71,94}};

         GradesBook myGradesBook = new GradesBook("java programming", gradesArray);
         System.out.printf("Welcome to the grade book for%n%s%n%n", myGradesBook.getCourseName());
         myGradesBook.processGrades();
     }
 }
