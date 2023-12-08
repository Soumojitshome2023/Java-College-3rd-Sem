
//  3. Write a Java Program grading system (using switch-case).
import java.util.Scanner;

class GradeCalculator {

    char calculateGrade(int score) {
        char grade;

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        return grade;
    }
}

public class Ass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeCalculator calculator = new GradeCalculator();

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            char grade = calculator.calculateGrade(score);
            System.out.println("Student's grade: " + grade);
        } else {
            System.out.println("Invalid Input");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
