class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Radius = " + c.radius);
        System.out.println("Area = " + c.area());
    }
}