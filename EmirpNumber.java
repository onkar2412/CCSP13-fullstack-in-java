public class EmirpNumber {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {

            int count = 0;

            // check if num is prime
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {

                // reverse the number
                int temp = num;
                int rev = 0;

                while (temp > 0) {
                    int rem = temp % 10;
                    rev = rev * 10 + rem;
                    temp = temp / 10;
                }

                // check if reverse is prime
                int count2 = 0;
                for (int j = 1; j <= rev; j++) {
                    if (rev % j == 0) {
                        count2++;
                    }
                }

                if (count2 == 2 && num != rev) {
                    System.out.println(num);
                }
            }
        }
    }
}