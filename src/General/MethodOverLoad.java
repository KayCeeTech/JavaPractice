package General;

  public class MethodOverLoad {

      public  int addNumbers(int numer1, int number2){
          return numer1 + number2;
      }

      public  double addNumbers(int number1, double number2){

          return number1 + number2;
      }

      public void addNumbers(double number1,  double number2){
          double sum = number1 + number2;
          System.out.printf("Addittion %f %f",sum);
      }

      public void addNumbers(double number1, int number2){
          double total =  (int) number1 + number2;
          System.out.printf("addition %f %f",total);
      }

      public static void main(String[] args) {
          MethodOverLoad methodOverLoad = new MethodOverLoad();
          methodOverLoad.addNumbers(20.3,10.5);
          System.out.println();

          methodOverLoad.addNumbers(10.8,19.5);
          System.out.println();

          methodOverLoad.addNumbers(5,6);
          System.out.println();

          methodOverLoad.addNumbers(3.5,5);
          System.out.println();
      }



  }
