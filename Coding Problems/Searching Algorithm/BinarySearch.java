 class BinarySearch {

    static void search(int a[],int num){
             int start=0;
             int end=a.length-1;
             int middle=(start+end)/2;
             while(start<=end){
                   if(a[middle]==num)
                   {
                    System.out.println("The Value At Index :"+middle);
                    return;
                   }
                   else if(a[middle]<num)
                   {
                        start=middle+1;
                   }
                   else{
                    end=middle-1;
                   }
                   middle=(start+end)/2;
             }
             System.out.println("Value Not Found");
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int num=1;
        search(a,num);
        
    }
}
