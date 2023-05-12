import java.util.*;
public class Amstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=sc.nextInt();
        int i=0,j=0,a=num;
         while(a>0)
         {
            i=a%10;
            j=(i*i*i)+j;
            a=a/10;
         }
         if(j==num)
         {
            System.out.println("Given Number is Amstrong");
         }
         else
         {
            System.out.println("Given Number is Not Amstrong");
         }
    }
}
