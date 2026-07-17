import java.util.Scanner;

public class string4 {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the word:-");
       String word  =  sc.nextLine();
       String rev = "";
       for (int i =word.length()-1;i>=0;i--)
       {
          rev = rev + word.charAt(i);
          System.out.println(word.charAt(i));
       }
       if(word.equalsIgnoreCase(rev))
       {
        System.out.println(word + "= is palindrome word");
       }
       else 
       {
        System.out.println(word +"= is a not palindrome word");
       }
    }
    
}
