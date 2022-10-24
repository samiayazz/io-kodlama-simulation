package entity;

import java.util.List;

public class Category {
    public Category(List<Course> courses, String name) {
        setCourses(courses);
        setName(name);
    }
    
    public Category() {
    }

    private int id = generateRandomId();
    private List<Course> courses;
    private String name;

    private int generateRandomId() {
        double id = Math.random() * 100;
        return (int) id;
    }

    public int getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
