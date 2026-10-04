class SeatReservation {

    int availableSeats = 100;

    synchronized void book(String passenger) {
        if (availableSeats > 0) {
            availableSeats--;

            System.out.println(
                passenger + " booked. Remaining: " + availableSeats
            );

        } else {
            System.out.println("No seats for " + passenger);
        }
    }
}

public class synch{

    public static void main(String[] args) {

        SeatReservation hall = new SeatReservation();

        Thread t1 = new Thread(() -> hall.book("Ravi"));
        Thread t2 = new Thread(() -> hall.book("Priya"));

        t1.start();
        t2.start();
    }
}