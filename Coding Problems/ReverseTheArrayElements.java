import java.util.*;
class ReverseTheArrayElements{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        reverseArray(a);
        System.out.println(Arrays.toString(a));

    }
    static void reverseArray(int a[]){
        int end=a.length-1;
        int start=0;
        int temp=0;
        while(start<end)
        {
              temp=a[start];
              a[start]=a[end];
              a[end]=temp;
              start++;
              end--;
        }

    }
}