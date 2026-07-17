public class Even {
    public static void main(String[] args) {
        int n = 15;          
        int product = 1;     

        for (int i = 2; i <= n; i += 2) {
            product = product * i;
        }

        System.out.println("Product of even numbers till " + n + " is: " + product);
    }
}