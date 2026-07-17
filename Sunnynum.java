import java.util.Scanner;

public class Sunnynum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("enter your number :- ");
        int a = sc.nextInt();
        int n = a +1;
        int root = (int)Math.sqrt(n);

        if(root * root == n) {
            System.out.println(n + " is a Sunny Number");
        } else {
            System.out.println(n + " is not a Sunny Number");
        }
    }
}
