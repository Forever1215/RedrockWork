/**
 * Created by alone on 2015/11/19.
 */
import java.util.ArrayList;
public class List {
    public static void main(String []args){
        ArrayList <String> arraylist = new ArrayList <String>();
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");

        int i = arraylist.size();//加相同元素前List的大小；
        System.out.println("加相同元素前List的大小是：" + i);

        arraylist.add("C");//增
        int j = arraylist.size();
        System.out.println("加相同元素后List的大小是：" + i);//相同元素被覆盖，只算一个；

        arraylist.add("E");
        int l = arraylist.size();
        System.out.println("第二次加不同元素后List大小为：" + l);

        for (int k = 0;k < arraylist.size();k++){
            String s = arraylist.get(k);
            System.out.println(s);
            //ArrayList是有顺序的；
            //相同元素占一个位置，但是会输出两次；
        }

        arraylist.remove("A");//删减
        for (int q = 0;q < arraylist.size();q++){
            String s = arraylist.get(q);
            System.out.print(s);
        }
        String c = arraylist.get(2);//查
        System.out.println("\n" + "要查的第二个元素为" +  c);

        arraylist.clear();//清空List所有元素；
        int s = arraylist.size();
        System.out.println("清空后List的大小为：" + s);
    }
}
