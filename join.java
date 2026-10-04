public class join {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        try {
            t1.join();  // main thread waits for t1 to finish

            Thread.sleep(500); // current thread sleeps 500ms

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}