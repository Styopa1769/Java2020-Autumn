import java.util.ArrayList;
import java.util.List;

public class Synch {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        Runnable r1 = new MyRunnable(list, 0);
        Runnable r2 = new MyRunnable(list, 10);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println(list);
    }

    public static final class MyRunnable implements Runnable{

        private final List<Integer> list;
        private final int from;

        public MyRunnable(List<Integer> list, int from) {
            this.list = list;
            this.from = from;
        }

        @Override
        public String toString() {
            return "MyRunnable{" +
                    "list=" + list +
                    ", from=" + from +
                    '}';
        }

        @Override
        public void run() {
            System.out.println(toString()+" is waiting");
            synchronized (list) {
                for (int i = from; i < from + 10; i++) {
                    list.add(i);
                    //имитируем долгое вычисление
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(toString()+" finished task");
        }
    }
}
