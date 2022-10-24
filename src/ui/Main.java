package ui;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.config.Config;
import core.logger.concrete.file.FileLogger;
import dao.concrete.jdbc.JDBCCategoryDao;
import dao.concrete.jdbc.JDBCCourseDao;
import dao.concrete.jdbc.JDBCEducatorDao;

public class Main {
    public static void main(String[] args) {
        Config.logger = new FileLogger();

        EducatorManager educatorManager = new EducatorManager(new JDBCEducatorDao());
        educatorManager.add(educatorManager.get().get(0));

        try {
            CategoryManager categoryManager = new CategoryManager(new JDBCCategoryDao());
            categoryManager.add(categoryManager.get().get(0));
        } catch (Exception e) {
            Config.logger.log(e.getMessage());
        }

        try {
            CourseManager courseManager = new CourseManager(new JDBCCourseDao());
            courseManager.add(courseManager.get().get(0));
        } catch (Exception e) {
            Config.logger.log(e.getMessage());
        }
    }
}