import java.util.*;
public class NumberDigitCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=sc.nextInt();
        int i=0;
         while(num>0)
         {   
            num=num/10;
            i++;
         }
         
            System.out.println("Number of digits i the given Number "+i);
         
    }
}
