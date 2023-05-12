public class PrimeNumber {
    public static void main(String[] args) {
     /*    int n=7;
        int c=0;
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0){
            c=1;
            break;
        }

    }
    if(c==0){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not Prime Number");
    }  */
    

    int n=100;
    int c=0;
    int k=0;
    while(k<100){
for(int i=2;i<=k/2;i++)
{
    if(n%i==0){
        c=1;
    }

}
if(c==0){
    System.out.println(i);
}
    k++;

}}}
