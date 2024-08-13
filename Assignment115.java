import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment115 {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Dir");
        Path outputFile = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Merge.txt");

        if (!Files.isDirectory(dir)) {
            System.err.println("The provided path is not a directory: " + dir);
            return;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
            List<Path> filesToMerge;
            try (Stream<Path> paths = Files.list(dir)) {
                filesToMerge = paths.filter(Files::isRegularFile).collect(Collectors.toList());
            }

            for (Path file : filesToMerge) {
                List<String> lines = Files.readAllLines(file);
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
