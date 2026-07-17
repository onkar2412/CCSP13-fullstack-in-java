import java.util.Scanner;

public class binaryarr {
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
         int len = arr.length;
         int si = 0, ei= len-1, mid = 0;
         boolean check = false;

         while (si<ei) {
            mid = (si+ei)/2;
            if (arr[mid]>target)
            {
                ei = mid -1;
            }
         else if (arr[mid]<target)
            {
                si = mid+1;
            } 
            else
                {
                    check = true ; 
                    break;
                }  
         }
         if (check == true)
         {
            System.out.println("search elemnt fpund in"+mid);
            System.out.println("position is"+ mid+1);
         }

    }
}
  

