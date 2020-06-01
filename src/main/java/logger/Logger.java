package logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private static final String FILE_PATH = "Logger.txt";

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance != null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void log(String test) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
            fileWriter.append(test);
            System.out.println(FILE_PATH.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

