import java.io.FileWriter;
import java.io.IOException;
public class FileOperation {
    
    public void saveFile (String line) {
        String[] lines = line.split(" ");
        String fileName = lines[0];
        try (FileWriter writer = new FileWriter(String.format("%s.txt", fileName), true)) {
            writer.append(line);
            writer.append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
