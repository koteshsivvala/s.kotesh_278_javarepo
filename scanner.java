import java.io.*;

class AppendDemo {

    public static void run() throws IOException {

        // Append data to the file
        FileWriter fw = new FileWriter("log.txt", true);
        fw.write("New entry appended\n");
        fw.close();

        // try-with-resources — auto closes stream (Java 7+)
        try (BufferedReader br =
                new BufferedReader(new FileReader("log.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } // br.close() called automatically
    }
}

public class scanner {

    public static void main(String[] args) throws IOException {
        AppendDemo.run();
    }
}