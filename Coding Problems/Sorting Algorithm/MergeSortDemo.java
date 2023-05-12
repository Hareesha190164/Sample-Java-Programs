import java.util.Arrays;

import java.util.*;
class MergeSortDemo {
          public static void main(String[] args) {
            int a[]={2,1,4,3,6,4,7};
            sort(a);

            System.out.println(Arrays.toString(a));
          }    
          static void sort(int a[]){

            int n=a.length;
            if(n<=1)
            {
                return;
            }
            int m=n/2;
            int l[]=new int[m];
            int r[]=new int[n-m];
            for(int i=0;i<l.length;i++)
            {
                l[i]=a[i];
            }
            for(int i=0;i<r.length;i++)
            {
                    r[i]=a[m++];
            }
            sort(l);
            sort(r);
            merge(l,r,a);

          }
          static void merge(int l[],int r[],int a[]){

                int i=0,j=0,k=0;
                while(i<l.length && j<r.length){
                        if(l[i]<r[j]){
                            a[k]=l[i];
                            i++;
                            k++;
                        }
                        else{
                            a[k]=r[j];
                            j++;
                            k++;
                        }

                }

                while(i<l.length){
                    a[k]=l[i];
                    i++;
                    k++;
                }
                while(j<l.length)
                {
                    a[k]=r[j];
                    k++;
                    j++;
                }
          }
}
