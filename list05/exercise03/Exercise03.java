package exercise03;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        
        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

    }
    
}
