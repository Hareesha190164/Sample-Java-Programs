import java.util.*;
class Practice{
    public static void main(String[] args) {
         int c=0;
         int a=0;
         int b=1;
        System.out.print(a+" "+b);
         while(c<10000){
          c=a+b;
          if(c>10000)
          {
            break;

          }
          System.out.print(" "+c);
          a=b;
          b=c;
           
         }
    
        
    }
}