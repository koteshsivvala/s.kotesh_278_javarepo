import java.io.*;

class CharStreamDemo {

    public static void run() throws IOException {
        // Writing characters
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java I/O is simple!\n");
        fw.write("Character streams handle Unicode.");
        fw.close();

        // Reading characters
        FileReader fr = new FileReader("notes.txt");
        int ch;

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}

public class streams{
    public static void main(String[] args) throws IOException {
        CharStreamDemo.run();
    }
}