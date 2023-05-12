import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Hello");
        li.add("Mr");
        li.add("Orey");
        String str[]=li.toArray(new String[li.size()]);
        System.out.println(Arrays.toString(str));

    }
}
