package core.logger.concrete.database;

import core.logger.virtual.BaseLogger;

public class DatabaseLogger implements BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged into database: " + message);
    }
}
