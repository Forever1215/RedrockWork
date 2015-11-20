/**
 * Created by alone on 2015/11/19.
 */
import java.util.HashMap;
public class Hash {
    public static void main(String []args){
        HashMap<String,String> hashmap = new HashMap<String,String>();
        boolean b = hashmap.isEmpty();
        System.out.println("这个HashMap是不是空：" + b);

        hashmap.put("1", "A");
        hashmap.put("2", "B");
        hashmap.put("3", "C");
        hashmap.put("4","D");

        String s = hashmap.get("2");
        System.out.println(s);

        boolean c = hashmap.isEmpty();
        System.out.println("添加键值对后，这个HashMap是否为空:" + c);

        int i = hashmap.size();
        System.out.println(i);

        hashmap.put("2","E");
        String a = hashmap.get("2");
        System.out.println(a);

        for (int k = 0;k < hashmap.size();k++){
            String x = hashmap.get("k");
            System.out.println(x);
        }
    }
}
