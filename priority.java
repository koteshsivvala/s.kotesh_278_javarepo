public class priority {

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                    Thread.currentThread().getName() + ": " + i
                );
            }
        };

        Thread t1 = new Thread(task, "High");
        Thread t2 = new Thread(task, "Low");

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        t1.start();
        t2.start();
    }
}