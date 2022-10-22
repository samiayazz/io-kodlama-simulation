package core.logger.concrete.file;

import core.logger.virtual.BaseLogger;

public class FileLogger implements BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged into file: " + message);
    }
}
