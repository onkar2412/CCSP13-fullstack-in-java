import java.util.Scanner;
public class string6
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();
        
        String words[] = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            StringBuilder sb= new StringBuilder(words[i]);
            sb.reverse();
            System.out.print(sb + " ");
        }
    }
} 