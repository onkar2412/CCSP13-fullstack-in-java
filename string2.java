import java.util.Scanner;

public class string2 {
    public static void main (String[]args)
    //WAC a coode to take a sentence as an input and count the frequency of "An" and "AND" without inbuild function
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your sentence :-");
        String sentence = sc. nextLine();

        int len  = sentence.length();
        int and = 0, an = 0, i,j;
        for(i = 0; i<len;i = j+1)
        {
           String word =" ";
           for ( j = 1; j<len && sentence.charAt(j)!=' ';j++)
           {
             word = word + sentence.charAt(j);       
           }
           if(word.equalsIgnoreCase("and"))
           {
            and++;
           }
           if(word.equalsIgnoreCase("an")){
            an++;
           }
        }
        System.out.println("Count on 'and'in a sentence is :-"+and);
        System.out.println("Count on 'an'in a sentence is :-"+an);

    }
    
}
