import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Assignment112 {
    public static void main(String[] args) {
        Path outputFile = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Output.txt");

        List<String> lines = Arrays.asList("Line 1", "Line 2", "Line 3");

        try {
            Files.write(outputFile, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
