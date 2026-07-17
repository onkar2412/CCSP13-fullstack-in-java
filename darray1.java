//array of arrays is callled multi dimensional arrays 
// arr [][][]= {{ },{ },{ }}

import java.util.Scanner;

public class darray1 {
    public static void main (String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the array elements:- ");
        // int arr [] = new int[3];
        // for (int i = 0; i<arr.length;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the array elements:- ");
        // //int arr [][] = new int[3][2];// jagged array

        // int arr[][]= new int [3][3];
        // for (int i = 0 ; i<3;i++)
        // {
        //     for (int j=0;j<3;j++)
        //     {
                
        //         System.out.print(arr[i][j] +" ");
        //     } 
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements:- ");

        int arr[][][]= new int [3][3][3];
        for (int i = 0 ; i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                
                for(int k = 0;k<3;k++)
                {
                   arr[i][j][k]=sc. nextInt();
                }
            } 
            
        }
         for (int i = 0 ; i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                
                for(int k = 0;k<3;k++)
                {
                    System.out.print(arr[i][j][k] +" ");
                }
            } 

    }
    System.out.println();
}
}