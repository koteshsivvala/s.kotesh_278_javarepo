import java.io.*;

class ByteStreamDemo {
    public static void run() throws IOException {
        // Writing bytes
        FileOutputStream fos = new FileOutputStream("data.bin");
        fos.write(65);  // writes byte value 65 ('A')
        fos.write(new byte[]{72, 101, 108, 108, 111}); // "Hello"
        fos.close();

        // Reading bytes
        FileInputStream fis = new FileInputStream("data.bin");
        int b;

        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}

public class Files{
    public static void main(String[] args) throws IOException {
        ByteStreamDemo.run();
    }
}