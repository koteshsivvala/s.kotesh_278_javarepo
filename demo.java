import java.io.*;

class BufferedDemo {

    public static void run() throws IOException {
        // Buffered writing
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        bw.write("Line 1: Java is powerful");
        bw.newLine();
        bw.write("Line 2: I/O is efficient");

        bw.flush();   // ensure buffer is written to disk
        bw.close();

        // Buffered reading — line by line
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

public class demo{
    public static void main(String[] args) throws IOException {
        BufferedDemo.run();
    }
}