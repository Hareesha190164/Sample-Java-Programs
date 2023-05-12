import java.util.*;
public class ReverseString {
    public static void main(String args[])
    {
        String str="HARI";
        String reverse="";
        int n=str.length();
        int i=n-1;
        while(i>=0)
        {
            reverse=reverse+str.charAt(i);
            i--;
        }
        System.out.println(reverse);
    }
}
