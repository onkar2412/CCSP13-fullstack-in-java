import java.util.Scanner;

public class array {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the elements:-");
        int arr[] = new int [10];
        for (int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched :-");
        int target = sc. nextInt();
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]==target){
                System.out.println("the target element fount in"+ i+"is"+target);
                System.out.println("position is:-"+ i+1);
                break;
        }
    }
}
  
}

