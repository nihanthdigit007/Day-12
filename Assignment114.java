import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

    public class Assignment114 {
        public static void main(String[] args) {
            Path path = Paths.get("C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_11\\src\\Output1.txt");

            String data = "This is the data to write into the file.";
            ByteBuffer buffer = ByteBuffer.allocate(data.length());
            buffer.put(data.getBytes());

            buffer.flip();

            try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
                fileChannel.write(buffer);
                System.out.println("Data written to file successfully.");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

