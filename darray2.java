import java.util.Scanner;

public class darray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][][] = new int[3][3][3];

        System.out.println("Enter the array elements:- ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int min = arr[0][0][0];
        int max = arr[0][0][0];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }

                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
// 3*3 matics and find the sum of each column