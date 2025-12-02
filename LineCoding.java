import java.util.Scanner;

public class LineCoding {

    // Function for Unipolar NRZ
    static void unipolarNRZ(int[] data) {
        System.out.println("Unipolar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("[+1] ");
            else System.out.print("[0] ");
        }
        System.out.println();
    }

    // Function for Polar NRZ
    static void polarNRZ(int[] data) {
        System.out.println("Polar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("[+1] ");
            else System.out.print("[-1] ");
        }
        System.out.println();
    }

    // Function for Manchester Encoding
    static void manchester(int[] data) {
        System.out.println("Manchester Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("[+1, -1] ");
            else System.out.print("[-1, +1] ");
        }
        System.out.println();
    }

    // Function for Differential Manchester Encoding
    static void differentialManchester(int[] data) {
        System.out.println("Differential Manchester Encoding:");
        int current = 1; // Assume starting high (+1)
        for (int bit : data) {
            if (bit == 1) {
                // Transition at beginning
                current = -current;
            }
            // Always transition at mid-bit
            if (current == 1) System.out.print("[+1, -1] ");
            else System.out.print("[-1, +1] ");
            current = -current; // flip for next bit
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Input number of bits
            System.out.print("Enter the number of bits in the data: ");
            int n = sc.nextInt();
            int[] data = new int[n];

            // Step 2: Input binary sequence
            System.out.println("Enter the binary data bits (0s and 1s): ");
            for (int i = 0; i < n; i++) {
                data[i] = sc.nextInt();
                if (data[i] != 0 && data[i] != 1) {
                    System.out.println("Invalid input. Only 0s and 1s allowed.");
                    return;
                }
            }

            // Step 3: Choose encoding method
            System.out.println("\nChoose a line coding technique:");
            System.out.println("1. Unipolar NRZ");
            System.out.println("2. Polar NRZ");
            System.out.println("3. Manchester");
            System.out.println("4. Differential Manchester");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            // Step 4: Call respective function
            switch (choice) {
                case 1 -> unipolarNRZ(data);
                case 2 -> polarNRZ(data);
                case 3 -> manchester(data);
                case 4 -> differentialManchester(data);
                default -> System.out.println("Invalid choice. Please select between 1 and 4.");
            }

            sc.close();
        }
    }
}
