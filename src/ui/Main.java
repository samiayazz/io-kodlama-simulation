package ui;

import core.config.Config;
import core.enums.LogType;
import core.enums.ORM;

public class Main {
    public static void main(String[] args) {
        Config.orm = ORM.JDBC;
        Config.logType = LogType.FILE;
    }
}