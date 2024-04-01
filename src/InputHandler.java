import java.util.Scanner;

// Class responsible for handling user input
public class InputHandler {
    private Scanner scanner; // Scanner object for input reading

    // Constructor to initialize the scanner
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // Method to get integer input from the user
    public int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) { // Check if input is not an integer
            System.out.println("Please enter a valid integer.");
            System.out.print(prompt);
            scanner.next(); // Discard invalid input
        }
        return scanner.nextInt(); // Return valid integer input
    }

    // Method to close the scanner
    public void closeScanner() {
        scanner.close();
    }
}
