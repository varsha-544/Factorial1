public class FactorialFinder {

    public static void main(String[] args) {
        // Input numbers to calculate the factorial
        int[] numbersToCalculate = {0, 1, 3, 5, 6};

        // Loop through the numbers and calculate their factorial
        for (int number : numbersToCalculate) {
            System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));
        }
    }

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        // Factorial of negative numbers is not defined
        if (number < 0) {
            return -1;  // Return -1 for invalid input
        }

        long factorial = 1;  // Start with 1 for multiplication

        // Loop from 1 to the given number and multiply to find the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
