import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String str[]={"HEllo","Mr","Hareesh"};
        List<String> li=new ArrayList<>();
        for(String srt:str){
            li.add(srt);
        }
        Iterator itr=li.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
