import java.util.*;
public class SumOfTheDigit { 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=sc.nextInt();
        int i=0,sum=0;
         while(num>0)
         {   
            i=num%10;
           sum+=i;
            num=num/10;
         }
         
            System.out.println("Sum of digits is the given Number "+sum);
         
    }
}
