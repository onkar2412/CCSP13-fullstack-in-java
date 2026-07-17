import java.util.Scanner;

public class sorting4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the elements:-");
        int arr[] = new int[5];
        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length-2;i>=0;i--)
        {
            for(int j = 0;j<=i;j++)
            {
               if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

           System.out.print(arr[arr.length-2]+" ");
    }
    
}
