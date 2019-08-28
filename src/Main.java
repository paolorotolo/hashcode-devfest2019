import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input_1.txt"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
        }

    }

}
