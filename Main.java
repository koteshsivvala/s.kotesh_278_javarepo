class Counter {
    static int count = 0; // shared by all objects
    int id;

    Counter() {
        count++;
        id = count;
    }

    static void showCount() {
        // Cannot access 'id' here because it is an instance variable
        System.out.println("Total objects: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Counter.showCount();
    }
}