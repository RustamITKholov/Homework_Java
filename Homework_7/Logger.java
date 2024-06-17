import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private PrintWriter writer;

    private static Logger logger;

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("./calculator.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        writer.println(message);
    }
}
