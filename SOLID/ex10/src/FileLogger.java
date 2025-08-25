import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private final String filename;

    public FileLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String msg) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write("[LOG] " + msg + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
