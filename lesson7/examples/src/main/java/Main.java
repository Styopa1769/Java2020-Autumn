public class Main {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        Thread t1 = new MyThread(i);
        Thread t2 = new MyThread(i);

        t1.start();
        t2.start();
        System.out.println(i);
    }
}
