//write a code to print all prime palindromic number from 10 to 10000;
public class PrimePalindrome {
    public static void main(String[] args) {

        for (int num = 10; num <= 10000; num++) {

      
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (count == 2 && num == rev) {
                System.out.println(num);
            }
        }
    }
}