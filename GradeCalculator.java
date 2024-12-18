import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their score
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        // Determine the grade based on the score
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else if (score < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score.");
        }

        // Close the scanner
        scanner.close();
    }
}
