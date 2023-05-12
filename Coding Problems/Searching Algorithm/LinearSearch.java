class LinearSearch {
    static void search(int a[],int num){
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                System.out.println("Given Value at index : "+i);
                return;
            }
        }
        System.out.println("Given Number Not found");


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int num=6;
          search(a,num);
    }
}