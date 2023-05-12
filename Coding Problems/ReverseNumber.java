import java.util.*;
import java.lang.*;
class ReverseNumber {
           public static void main(String args[]) {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter a number");
               int num=sc.nextInt();
            /*  int a=0,b=0;
               while(num>0)
               {
                a=num%10;
                b=(b*10)+a;                
                num=num/10;
               }
             System.out.println("reverse number is:"+b);    */
             
               //using String Buffer        
        StringBuffer obj=new StringBuffer(String.valueOf(num));
        System.out.println(obj.reverse());
        
           }
}