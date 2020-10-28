import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
    AtomicInteger i;

    public RaceCondition(int i) {
        this.i = new AtomicInteger(i);
    }

    public void increment(){
        i.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition rc = new RaceCondition(0);
        Runnable runnable = new MyRunnable(rc);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(rc.i);
    }

    public static final class MyRunnable implements Runnable{

        private final RaceCondition rc;

        public MyRunnable(RaceCondition rc) {
            this.rc = rc;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                rc.increment();
            }
        }
    }
}
