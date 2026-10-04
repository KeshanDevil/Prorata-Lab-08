public class IT21047756Lab8Q2 {
    public static void main(String[] args) {

        // Create and initialize array A
        int[] A = {10, 20, 30, 40, 50};

        // Create and initialize array B
        int[] B = {34, 67, 12, 89, 12};

        // Create array C to store the result
        int[] C = new int[5];

        // Add A and B and store the result in C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display array C
        System.out.println("Array C (A + B):");

        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }
    }
}