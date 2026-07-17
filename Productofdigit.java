import java.util.Scanner;

public class Productofdigit {
     public static void main(String[] args) {

        int num = 1124;
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
        if (sum == product)
        {
            System.out.println("this is spy number");
        }
        else{

        System.out.println("not spy number");
        }
    }
}
