import java.util.Scanner;

public class IT21047756Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create myArray with size 5
        int[] myArray = new int[5];

        // Get 5 numbers from the keyboard
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Create evenArray with size 5
        int[] evenArray = new int[5];

        // Variable to keep track of even numbers
        int count = 0;

        // Find even numbers in myArray
        for (int i = 0; i < 5; i++) {

            // Check whether the number is even
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        // Display the even numbers
        System.out.println("Even numbers:");

        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }

        input.close();
    }
}