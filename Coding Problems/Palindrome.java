import java.util.*;
public class Palindrome {
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=sc.nextInt();
        int i=0,j=0,a=num;
         while(a>0)
         {
            i=a%10;
            j=(j*10)+i;
            a=a/10;
         }
         if(j==num)
         {
            System.out.println("Given Number is palindrome");
         }
         else
         {
            System.out.println("Given Number Not Palindrome");
         }
    }
}
