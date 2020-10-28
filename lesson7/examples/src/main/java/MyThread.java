public class MyThread extends Thread {
    private int integer;

    public MyThread(int i) {
        this.integer = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            integer++;
        }
    }
}
