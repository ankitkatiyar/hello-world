package learning;


public class StringMasking
{
    public static void main(String[] args)
    {
        String s = "1234567890";
         s = s.replaceAll("\\b(\\d{4})\\d+(\\d{2})", "$1*****$2");
        //s.replaceAll("(?<=.{3}).", "*");
        System.out.println(s);
        
    }
}
