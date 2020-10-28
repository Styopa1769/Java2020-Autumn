import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SynchMethod {

    public static class User{
        private final int age;
        private final String name;

        private final static ReentrantReadWriteLock LOCK = new ReentrantReadWriteLock();

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        /**
         * This is threadsafe method
         */
        public void print() throws InterruptedException {
            LOCK.writeLock().lock();
            try{
                System.out.print("Привет, ");
                Thread.sleep(10);
                System.out.print("меня зовут: ");
                Thread.sleep(10);
                System.out.print(name + ", ");
                Thread.sleep(10);
                System.out.print("мой возраст: ");
                Thread.sleep(10);
                System.out.print(age);
                System.out.println();
            } finally {
                LOCK.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        User stepan = new User(23, "Stepan");
        User ivan = new User(20, "Ivan");

        Runnable r1 = new MyRunnable(stepan);
        Runnable r2 = new MyRunnable(ivan);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Thread.sleep(1000);

    }

    public static final class MyRunnable implements Runnable{

        private final User user;

        public MyRunnable(User user) {
            this.user = user;
        }

        @Override
        public void run() {
            try {
                user.print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
