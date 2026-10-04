import java.util.Scanner;

public class IT21047756Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an array to store 8 Student IDs
        int[] studentsArray = new int[8];

        // Input 8 valid Student IDs
        int i = 0;

        while (i < 8) {

            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int studentID = input.nextInt();

            // Check whether the Student ID is valid
            if (studentID <= 0) {
                System.out.println("Error! Student ID must be positive.");
            }
            else {
                // Store the Student ID in the array
                studentsArray[i] = studentID;
                i++;
            }
        }

        // Display the Student IDs
        System.out.println("\nStudent IDs in the array:");

        for (i = 0; i < 8; i++) {
            System.out.println(studentsArray[i]);
        }

        // Ask for a Student ID to search
        System.out.print("\nEnter Student ID to search: ");
        int searchID = input.nextInt();

        // Search for the Student ID
        boolean found = false;

        for (i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}