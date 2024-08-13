import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Assignment113 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Input.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());

            fileChannel.read(buffer);

            buffer.flip();

            byte[] bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
            String content = new String(bytes);
            System.out.println(content);
            System.out.println("File Found");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}

