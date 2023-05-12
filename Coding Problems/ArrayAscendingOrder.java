public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int a[]={3,2,5,4,1};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j]){    //if(a[j]>a[i])---> for Decending Order
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
        
    }
    
}
