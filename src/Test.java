/**
 * Created by alone on 2015/11/20.
 */
public class Test {
    public static void main(String []args){
        Run run1 = new Run();
        Run run2 = new Run();

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}
