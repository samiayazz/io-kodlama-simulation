package core.logger.concrete.mail;

import core.logger.virtual.BaseLogger;

public class MailLogger implements BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged into mail: " + message);
    }
}
