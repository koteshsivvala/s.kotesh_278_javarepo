class Student {
    // Fields (state)
    int rollNo;
    String name;
    double marks;

    // Method (behaviour)
    void display() {
        System.out.println("Roll: " + rollNo + " Name: " + name);
    }
}

public class student {
    public static void main(String[] args) {
        Student s1 = new Student(); // object creation
        s1.rollNo = 278;
        s1.name = "kotesh";
        s1.marks = 92.5;
        s1.display();
    }
}