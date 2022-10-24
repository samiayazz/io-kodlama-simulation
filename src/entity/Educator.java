package entity;

import java.util.List;

public class Educator {
    public Educator(List<Course> courses, String firstName, String lastName) {
        setCourses(courses);
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Educator() {
    }

    private int id = generateRandomId();
    private List<Course> courses;
    private String firstName;
    private String lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
