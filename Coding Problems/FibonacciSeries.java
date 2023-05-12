import java.util.*;
public class FibonacciSeries {
          public static void main(String args[]) 
          {
            int a=0,b=1;
            System.out.println(a+"\n"+b);
            int c=0;
            while(c<=1000)
            {
                c=a+b;
                if(c>1000)
                {
                    break;
                }
                System.out.println(c);
                a=b;b=c;
            }
          }   
}
