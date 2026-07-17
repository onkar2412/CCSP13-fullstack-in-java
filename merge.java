public class merge {
    public static void main(String[] args) {
        int arr1[] = {11,22,33};
        int arr2[] = {44,55,66};
        int merge [] = new int [arr1.length + arr2.length];
        for (int i = 0; i <arr1.length;i++)
        {
            merge [i] = arr1[i];
          
        }
        for (int i = 0; i<arr2.length;i++)
        {
            merge [arr1.length+i] = arr2[i];

    }
    for (int n : merge)
    {
        System.out.println(n+" ");
    }
    
}

