/**
 * Created by alone on 2015/11/20.
 */
public class Run implements Runnable {
    int i = 0;
    public void run (){
        //因为两个线程共用一个线程块，所以可能有些线程会出错
        //就像会出现234--6两个线程交叉 可能出错。
//        while(ture){
//            System.out.println(Thread.currentThread().getName() + "--->>>" + i);
//

        //为线程上同步锁
        //上锁后 线程会识别相同线程块 避免数据出错
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
