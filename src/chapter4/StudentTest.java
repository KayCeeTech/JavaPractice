package chapter4;
 import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student1 = new Student("Victoria", 93.5);
        Student student2 = new Student("Pelumi", 80.3);
        Student student3 = new Student("ChidiNma", 60.8);
        System.out.printf("%s You Scored Grade A:%s%n", student1.getName(), student1.getAverage());
        System.out.printf("%s You Scored Grade B: %s%n", student2.getName(),student2.getAverage());
        System.out.printf("%s You Scored Grade B: %s%n", student3.getName(), student3.getAverage());
    }
}
