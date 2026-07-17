import java.util.Scanner;

public class string3 {
    public static void main(String[]  args)
    {
    
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter your sentence :-");
        // String sentence = sc. nextLine();
        // String str = "watermelon";
        // String s[] = str.split("e");
        // System.out.println(s[1]);
         
        String sentence =  " An tiger and Deer are BSF's"; 
        String words [] = sentence.split(" ");
        for (int i = 0; i <words.length;i++)
        {
            if ( words[i].equalsIgnoreCase("and"))
            {
                and++;
            }
            if (words[i].equalsIgnoreCase("an"))
            {
                an++;
            }
        }
        System.out.println("the number of an in this sentence is :-"+and);

    }
    
}
