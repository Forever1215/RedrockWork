/**
 * Created by alone on 2015/11/20.
 */
public class Run implements Runnable {
    int i = 0;
    public void run (){
        //��Ϊ�����̹߳���һ���߳̿飬���Կ�����Щ�̻߳����
        //��������234--6�����߳̽��� ���ܳ���
//        while(ture){
//            System.out.println(Thread.currentThread().getName() + "--->>>" + i);
//

        //Ϊ�߳���ͬ����
        //������ �̻߳�ʶ����ͬ�߳̿� �������ݳ���
        synchronized(this){
            while(true){
                System.out.println(Thread.currentThread().getName() + "--->>> " + i);
                i = i + 1;
                if(i == 100){
                    break;
                }
            }
        }
    }
}
