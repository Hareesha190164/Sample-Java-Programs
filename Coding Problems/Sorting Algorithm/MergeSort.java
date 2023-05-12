
    

class MergeSort {
    public static void main(String[] args) {
        
        int arr[] ={4,6,8,7,3,2,0};
        
        sort(arr);
        
        for(int k:arr)
        System.out.print(k+" ");
            
      }
      
      static void sort(int[] arr){
        
        if(arr.length<=1)
          return;
          
        int n = arr.length;
        
        int mid = n/2;
        
        int left[]= new int[mid];
        
        int right[] = new int[n-mid];
        
        for(int i=0;i<mid;i++)
          left[i]=arr[i];
          
        for(int j=0;j<right.length;j++)
            right[j]=arr[mid++];
          
        sort(left);  // left array will be sorted
        sort(right); // right array will be sorted
        merge(left,right,arr); // complete array will be sorted
          
      }
      
      static void merge(int[] left,int[] right,int[] arr){
          
          int i=0,j=0,k=0;
          
          while(i<left.length && j<right.length){
              if(left[i]<right[j]){
                     arr[k]=left[i];
                     k++;
                     i++;
              }
              else{
                  arr[k]=right[j];
                  j++;
                  k++;
              }
          }
          
          while(i<left.length){
              arr[k]=left[i];
              i++;
              k++;
          }
          while(j<right.length){
              arr[k]=right[j];
              j++;
              k++;
          }
    }
  }
  
    

