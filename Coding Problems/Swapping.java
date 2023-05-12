import java.util.*;
public class Swapping {
          public static void main(String args[])
          {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Any Two Values");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Values Of A and B Before swapping "+a+" and "+b);
            // Using Third Variable
          /*int c=a;
              a=b;
              b=c;
            System.out.println("The Values Of A and B After Swapping  "+a+" and "+b);
            */

            //Without using third Variable
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After Swapping "+a+" "+b);
          }    
}
