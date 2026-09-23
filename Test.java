class Student {
    int    rollNo;
    String name;
    double cgpa;

    Student() {                         // No-arg
        rollNo = 0; name = "Unknown"; cgpa = 0.0;
    }
    Student(int r, String n) {          // 2-arg
        rollNo = r; name = n; cgpa = 0.0;
    }
    Student(int r, String n, double g) { // 3-arg
        rollNo = r; name = n; cgpa = g;
    }
    void show() {
        System.out.printf("%d | %s | %.2f%n", rollNo, name, cgpa);
    }
}

public class Test {
    public static void main(String[] args) {
        new Student().show();
        new Student(101, "kotesh").show();
        new Student(102, "hinata", 9.2).show();
    }
}
class MathUtil {
    static int    square(int n)    { return n * n; }
    static double square(double n) { return n * n; }

    static int    add(int a, int b)          { return a + b; }
    static int    add(int a, int b, int c)    { return a + b + c; }
    static double add(double a, double b)    { return a + b; }
}