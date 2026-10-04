import java.util.Scanner;

public class IT21047756Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an integer array of size 6
        int[] numbers = new int[6];

        // Store 6 positive numbers
        int i = 0;

        while (i < 6) {

            System.out.print("Enter positive number " + (i + 1) + ": ");
            int number = input.nextInt();

            // Check whether the number is positive
            if (number <= 0) {
                System.out.println("Error! Please enter a positive number.");
            }
            else {
                // Store the positive number in the array
                numbers[i] = number;
                i++;
            }
        }

        // Display the array contents
        System.out.println("\nArray contents:");

        for (i = 0; i < 6; i++) {
            System.out.println(numbers[i]);
        }

        // Find the maximum number
        int maximum = numbers[0];

        for (i = 1; i < 6; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        // Display the maximum number
        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}