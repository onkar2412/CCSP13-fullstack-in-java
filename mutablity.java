public class mutablity
{
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer("namaste");
        sb.append(" duniya"); // same as concat method in string
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder("YOLO");
        sb1.append("- YOU ONLY LIVE ONCE");
        sb1.reverse();
        System.out.println(sb1);

       // String to stringbuffer/ stringbuilder and vice versa
       
        String str = "SBI YONO";
        StringBuffer sbi = new StringBuffer(str);
        sbi.deleteCharAt(2);
        System.out.println(sbi);
        sbi.delete(3,5);
        System.out.println(sbi);

        String s = sbi.toString();
        System.out.println(s);




    }
}