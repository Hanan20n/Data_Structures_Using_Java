
import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversityExamRegistrationSystem{

    public static void register(Scanner input)
            throws InvalidRegistrationException {

        System.out.println("===== EXAM REGISTRATION SYSTEM =====");
        System.out.println();

        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();

        if (studentId.trim().isEmpty()) {
            throw new InvalidRegistrationException(
                    "Student ID cannot be empty."
            );
        }

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        if (studentName.trim().isEmpty()) {
            throw new InvalidRegistrationException(
                    "Student name cannot be empty."
            );
        }

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        if (age < 18) {
            throw new InvalidRegistrationException(
                    "Student must be at least 18 years old."
            );
        }

        System.out.print("Enter Exam Mark: ");
        double mark = input.nextDouble();

        if (mark < 0 || mark > 100) {
            throw new InvalidRegistrationException(
                    "Mark must be between 0 and 100."
            );
        }

        System.out.print("Enter Number of Subjects: ");
        int subjects = input.nextInt();

        if (subjects < 1) {
            throw new InvalidRegistrationException(
                    "Minimum allowed subjects is 1."
            );
        }

        if (subjects > 5) {
            throw new InvalidRegistrationException(
                    "Maximum allowed subjects is 5."
            );
        }

        System.out.println();
        System.out.println("Registration Successful!");
        System.out.println("Student: " + studentName);
        System.out.println("Registered Subjects: " + subjects);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            register(input);

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Registration Failed!");
            System.out.println(
                    "Error: Please enter valid numbers."
            );

        } catch (InvalidRegistrationException e) {
            System.out.println();
            System.out.println("Registration Failed!");
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println();
            System.out.println("Registration attempt completed.");
            input.close();
        }
    }
}

class InvalidRegistrationException extends Exception {

    public InvalidRegistrationException(String message) {
        super(message);
    }
}
