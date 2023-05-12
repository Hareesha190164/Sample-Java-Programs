import java.util.*;

public class BitmapHoles {
    public static void main(String[] args) {
        int n=6;
        int k=0;
        Set<Integer> obj=new HashSet<Integer>();
        
        obj.add(10);
        for(int i=1;i<=n/2;i++)
        {
           k=i+(n+1-i);
           obj.add(k);
        }
        

        obj.add(100);
        obj.add(200);
        
        obj.add(100);
        obj.clear();
        System.out.println(obj);

    }
}

