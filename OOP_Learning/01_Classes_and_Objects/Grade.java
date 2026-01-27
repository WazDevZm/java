import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // Request input from the user
        System.out.print("Enter your marks: ");
        Scanner scanner = new Scanner(System.in);

        int marks;
        if (scanner.hasNextInt()) {
            marks = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer value for marks.");
            scanner.close();
            return;
        }

        if (marks >= 86 && marks <= 100) {
            System.out.println("Your grade is A");
        } else if (marks >= 76 && marks <= 85) {
            System.out.println("Your grade is B");
        } else if (marks >= 66 && marks <= 75) {
            System.out.println("Your grade is C");
        } else if (marks >= 56 && marks <= 65) {
            System.out.println("Your grade is D");
        } else if (marks >= 0 && marks <= 55) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid marks entered.");
        }

        // Always a good practice to close the scanner
        scanner.close();
    }

}
