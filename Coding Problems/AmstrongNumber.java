import java.util.*;
public class AmstrongNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        for(int k=0;k<=1000;k++)
        {
            int i=0,j=0,a=k;
        while(a>0)
        {
           i=a%10;
           j=(i*i*i)+j;
           a=a/10;
        }
        if(j==k)
        {
           System.out.println(k);
        }
    }
    }
}
