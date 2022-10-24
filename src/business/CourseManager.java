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

    public void add(Course course) throws Exception {
        if (courseDao.isCourseNameExists(course.getName())) courseDao.add(course);
        else throw new Exception("Hata: Bu kategori adıyla daha önce sistemde bir kayıt oluşturulmuş.");
    }

    public void update(int oldCourseId, Course newCourse) throws Exception {
        if (courseDao.isCourseNameExists(newCourse.getName())) courseDao.update(oldCourseId, newCourse);
        else throw new Exception("Hata: Bu kategori adıyla daha önce sistemde bir kayıt oluşturulmuş.");
    }

    public void delete(int id) {
        courseDao.delete(id);
    }
}
