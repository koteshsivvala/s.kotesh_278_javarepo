class Box {

    double length, width, height;

    // No-arg constructor
    Box() {
        length = width = height = 1.0;
    }

    // Parameterized constructor
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {

        // Using no-argument constructor
        Box box1 = new Box();
        System.out.println("Volume of Box 1: " + box1.volume());

        // Using parameterized constructor
        Box box2 = new Box(10.0, 5.0, 2.0);
        System.out.println("Volume of Box 2: " + box2.volume());
    }
}