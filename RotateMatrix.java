import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        // Input
        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][3 - 1 - j];
                arr[i][3 - 1 - j] = temp;
            }
        }

        // Output
        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}