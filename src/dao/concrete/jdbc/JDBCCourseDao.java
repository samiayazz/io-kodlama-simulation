package dao.concrete.jdbc;

import dao.virtual.BaseCourseDao;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class JDBCCourseDao implements BaseCourseDao {
    @Override
    public List<Course> get() {
        //JDBC Operations
        return new ArrayList<Course>();
    }

    public boolean isCourseNameExists(String name) {
        //Control
        return false;
    }

    @Override
    public void add(Course course) {
        //JDBC Operations
        System.out.println("JDBC: \"" + course.getName() + "\" adlı kurs oluşturuldu!");
    }

    @Override
    public void update(int oldCourseId, Course newCourse) {
        //JDBC Operations
        System.out.println("JDBC: \"" + newCourse.getName() + "\" adlı kurs oluşturuldu!");
    }

    @Override
    public void delete(int id) {
        //JDBC Operations
        System.out.println("JDBC: Kurs silindi!");
    }
}
