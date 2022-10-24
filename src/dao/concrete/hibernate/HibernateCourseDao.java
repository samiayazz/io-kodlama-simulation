package dao.concrete.hibernate;

import dao.virtual.BaseCourseDao;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements BaseCourseDao {
    @Override
    public List<Course> get() {
        //Hibernate Operations
        return new ArrayList<Course>();
    }

    public boolean isCourseNameExists(String name) {
        //Control
        return false;
    }

    @Override
    public void add(Course course) {
        //Hibernate Operations
        System.out.println("Hibernate: \"" + course.getName() + "\" adlı kurs oluşturuldu!");
    }

    @Override
    public void update(int oldCourseId, Course newCourse) {
        //Hibernate Operations
        System.out.println("Hibernate: \"" + newCourse.getName() + "\" adlı kurs oluşturuldu!");
    }

    @Override
    public void delete(int id) {
        //Hibernate Operations
        System.out.println("Hibernate: Kurs silindi!");
    }
}
