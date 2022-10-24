package dao.virtual;

import entity.Category;
import entity.Course;

import java.util.List;

public interface BaseCourseDao {
    List<Course> get();

    boolean isCourseNameExists(String name);

    void add(Course course);

    void update(int oldCourseId, Course newCourse);

    void delete(int id);
}
