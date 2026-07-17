import java.util.Scanner;

public class PrimeArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        // Prime check
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        // Armstrong check
        int temp = num;
        int sum = 0;

        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem*rem*rem;
            temp = temp / 10;
        }

        if(count == 2 && sum == num){
            System.out.println("Prime and Armstrong number");
        }
        else{
            System.out.println("Not Prime Armstrong number");
        }
    }
}