//bubble sorting
import java.util.Scanner;

public class sorting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the elements:-");
        int arr[] = new int [10];
        for (int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length-2;i>=0;i--)
        {
        
            for (int j =0;j<=i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
               for (int i =0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
    }
}
}
