import java.util.*;
public class StringPalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.nextLine();
        String reverse="";
        int n=str.length();
        int i=n-1;
        while(i>=0)
        {
            reverse=reverse+str.charAt(i);
            i--;
        }
        if(reverse.equals(str))
        {
        System.out.println("Given String is Palindrome");
        }
        else
          {
            System.out.println("GivenString is Not Palindrome");
          }
    }
    
}
