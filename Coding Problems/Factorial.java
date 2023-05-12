import java.util.*;
import java.lang.*;
class Factorial {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter One Number");
       int n=sc.nextInt();
      /*  int fact=n;
       for(int i=1;i<n;i++)
       {
          fact=fact*i;
       }
       System.out.println("Factorial of given number "+n+" is "+fact);  */

       //using recursion
       int res=factorial(n);
       System.out.println(res);
    }
    static int factorial(int n){
      if(n>=1){
         return n * factorial(n-1);
      }
        else{
         return 1;
        }
    }
}
