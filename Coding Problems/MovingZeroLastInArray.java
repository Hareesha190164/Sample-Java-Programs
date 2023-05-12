import java.util.*;
class MovingZeroLastInArray{
    public static void main(String args[])
    {
          int a[]={1,0,3,0,0,5,3,1,0,8,0,0,7,0};
          
          int c=0,n=a.length,d=n-1;

          //With Using new Array
        /*   int b[]=new int[n];
          for(int i=0;i<n;i++)
          {
            if(a[i]!=0)
            {
                b[c]=a[i];
                c++;
            }
          }*/
          Arrays.sort(a);
             
          for(int i=0;i<n/2;i++)
          {
            c=a[i];
            a[i]=a[d];
            a[d]=c;
            c++;
            d--;

          }
          for(int i=0;i<n;i++)
          {
            System.out.println(a[i]);
          }

    }
}