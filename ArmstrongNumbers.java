//write a code to pritn all armstrong numbers from 1 to 100000
public class ArmstrongNumbers {
    public static void main(String[] args) {

        for (int num = 1; num <= 100000; num++) {

            int temp = num;
            int digits = 0;

            
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power = power * rem;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

