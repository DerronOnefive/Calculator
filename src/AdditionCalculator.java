// Main class for the addition calculator program
public class AdditionCalculator {
    public static void main(String[] args) {
        // Create an instance of InputHandler class to handle user input
        InputHandler inputHandler = new InputHandler();
        // Create an instance of Calculator class to perform addition
        Calculator calculator = new Calculator();

        // Get first integer input from the user
        int num1 = inputHandler.getIntInput("Enter the first integer: ");
        // Get second integer input from the user
        int num2 = inputHandler.getIntInput("Enter the second integer: ");

        // Perform addition using Calculator class
        int sum = calculator.add(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to release resources
        inputHandler.closeScanner();
    }
}
