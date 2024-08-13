
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        try {
            Path path = Path.of("Hello.txt");
            List<String> data = Files.readAllLines(path);
            System.out.print(data);
        }
        catch (IOException _) {}

    }
}