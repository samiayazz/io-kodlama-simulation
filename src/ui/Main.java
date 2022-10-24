package ui;

import core.config.Config;
import core.logger.concrete.file.FileLogger;

public class Main {
    public static void main(String[] args) {
        Config.logger = new FileLogger();
    }
}