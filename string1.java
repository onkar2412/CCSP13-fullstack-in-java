public class string1 {
    public static void main(String[] args) {
        String s = "application";
        // System.out.println(s.length());
        // System.out.println(s.charAt(4));
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());

        // //Substring
        // System.out.println(s.substring(5));
        // System.out.println(s.substring(5,8));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a' , 2)); //it will look for a from the 2nd index instead of 0th.
        System.out.println(s.lastIndexOf('a'));

    //WAC to take a word as an input and convret it into in its relevant piglatin form
    // String s = "THALA";
    // String word = s.toLowerCase();
    // String string1 = "";
    // String string2= "";

    // for(int i = 0; i <=word.length(); i++){
    //     char ch = word.charAt(i);
    //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //     string1 = word.substring(i);
    // } else{
    //     string2 = string2 + ch;
    //     }
    // }
    // System.out.println(string1+string2+"ay");
    }
}