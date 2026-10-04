import java.io.*;

class FileDemo {

    public static void run() {

        File f = new File("output.txt");

        System.out.println(f.exists());        // true/false
        System.out.println(f.getName());       // output.txt
        System.out.println(f.length());       // size in bytes
        System.out.println(f.isFile());        // true
        System.out.println(f.isDirectory());  // false

        // Create directory
        new File("myFolder").mkdir();

        // List files in a directory
        File dir = new File(".");

        for (String name : dir.list()) {
            System.out.println(name);
        }
    }
}

public class hi{
    public static void main(String[] args) {
        FileDemo.run();
    }
}