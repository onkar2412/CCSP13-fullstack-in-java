import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("enter your number :- ");
        int a = sc.nextInt();
        for (int i = 1; i<=a;i++)
        {
            if (a % 1==0){
                count ++;
            }
        }
        int copy = a ;
        int sum = 0;
        while (num>0)
        {
            int rem =  num %10;
            sum = sum *10+rem;
            a =  a /10;
        }
        if (sount == 2 && sum == copy)
        {
            System.out.println("this is prime and palindrom");
        }
        else{
            System.out.println("this is not palindrom");
        }
    }
    
}
