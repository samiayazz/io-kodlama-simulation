package business;

import dao.virtual.BaseCourseDao;
import entity.Course;

import java.util.List;

public class CourseManager {
    private BaseCourseDao courseDao;

    public CourseManager(BaseCourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Course> get() {
        return courseDao.get();
    }

    public void add(Course course) {
        courseDao.add(course);
    }

    public void update(int oldCourseId, Course newCourse) {
        courseDao.update(oldCourseId, newCourse);
    }

    public void delete(int id) {
        courseDao.delete(id);
    }
}
