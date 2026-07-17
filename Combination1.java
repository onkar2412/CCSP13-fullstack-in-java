import java.util.Scanner;

public class Combination1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number :- ");
        int a = sc.nextInt();

        int count = 0;

        
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0){
                count++;
            }
        }

        int temp = a;
        int sum = 0;

        while(temp > 0) {
            int rem = temp % 10;
            int fact = 1;

            for(int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (count == 2 && sum == a)
        {
            System.out.println("This number is Prime and Special");
        }
        else{
            System.out.println("This number is not Prime and Special");
        }
    }
}