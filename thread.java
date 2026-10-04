class MyThread extends Thread {

    @Override
    public void run() {
        // Code that runs in new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class thread{

    public static void main(String[] args) {

        MyThread t = new MyThread();

        // Start the thread
        t.start();
    }
}