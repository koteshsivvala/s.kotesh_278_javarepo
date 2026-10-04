class SharedBuffer {

    int data;
    boolean ready = false;

    synchronized void produce(int val) throws InterruptedException {
        while (ready)
            wait();   // wait if not consumed yet

        data = val;
        ready = true;

        System.out.println("Produced: " + val);

        notify();     // wake up consumer
    }

    synchronized int consume() throws InterruptedException {
        while (!ready)
            wait();   // wait until data is available

        ready = false;

        notify();     // wake up producer

        return data;
    }
}

public class inter {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int value = buffer.consume();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        producer.start();
        consumer.start();
    }
}