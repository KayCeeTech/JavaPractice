package Chapter7;

  public class GradeBook {
      private  String courseName;
      private int[] grades;

      public GradeBook(String courseName, int[] grades){
          this.courseName = courseName;
          this.grades = grades;
      }
      public  void setCourseName(String courseName){
          this.courseName = courseName;
      }
      public String getCourseName(){
          return courseName;
      }
      public void  processGrade(){
          outputGrades();
          System.out.printf("%nClass average is %.2f%n",getAverage());
          System.out.printf("Lowest is: %d5%n Highest grade is: %d%n%n",getMaximum(), getMinimum());
          outputBarChart();
      }
      public int getMinimum(){
          int lowGrade = grades[0];

          for (int grade : grades){
              if(grade < lowGrade){
                  lowGrade = grade;
              }
          }
          return lowGrade;
      }
      public int getMaximum(){
          int highGrade = grades[0];

          for (int grade : grades){
              if(grade > highGrade){
                  highGrade = grade;
              }
          }
          return highGrade;
      }
      public double getAverage(){
          int total = 0;

          for(int grade : grades){
              total = total + grade;
          }
          return  (double) total / grades.length;

      }
      public  void  outputBarChart(){
          System.out.printf("Grade distribution:");

          int [] frequency = new int[11];
          for(int grade : grades){
              ++frequency[grade / 10];

          }
          for (int count = 0; count < frequency.length; count++){
              if (count == 0){
                  System.out.printf("%5d: ", 100);
              }
              else {
                  System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
              }
              for (int stars = 0; stars < frequency.length; stars++){
                  System.out.printf("*");
              }
              System.out.println();
          }

      }
      public  void  outputGrades(){
          System.out.printf("The grades are:%n%n");

          for (int student = 0; student < grades.length; student++){
              System.out.printf("Student %2d: %2d%n",student + 1, grades[student]);
          }
      }
  }
