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

        int i = arraylist.size();//����ͬԪ��ǰList�Ĵ�С��
        System.out.println("����ͬԪ��ǰList�Ĵ�С�ǣ�" + i);

        arraylist.add("C");//��
        int j = arraylist.size();
        System.out.println("����ͬԪ�غ�List�Ĵ�С�ǣ�" + i);//��ͬԪ�ر����ǣ�ֻ��һ����

        arraylist.add("E");
        int l = arraylist.size();
        System.out.println("�ڶ��μӲ�ͬԪ�غ�List��СΪ��" + l);

        for (int k = 0;k < arraylist.size();k++){
            String s = arraylist.get(k);
            System.out.println(s);
            //ArrayList����˳��ģ�
            //��ͬԪ��ռһ��λ�ã����ǻ�������Σ�
        }

        arraylist.remove("A");//ɾ��
        for (int q = 0;q < arraylist.size();q++){
            String s = arraylist.get(q);
            System.out.print(s);
        }
        String c = arraylist.get(2);//��
        System.out.println("\n" + "Ҫ��ĵڶ���Ԫ��Ϊ" +  c);

        arraylist.clear();//���List����Ԫ�أ�
        int s = arraylist.size();
        System.out.println("��պ�List�Ĵ�СΪ��" + s);
    }
}
