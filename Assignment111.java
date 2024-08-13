import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Assignment111 {
        public static void main(String[] args) {
            Path inputFile = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Input.txt");

            try {
                Files.lines(inputFile).forEach(line -> {
                    System.out.println(line);
                });
            } catch (IOException e) {
                System.err.println("An Error occured: " + e.getMessage());
            }
    }

}
