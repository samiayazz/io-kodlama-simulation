package entity;

public class Course {
    public Course() {
    }

    public Course(String name, String imgPath) {
        setName(name);
        setImgPath(imgPath);
    }

    private int id = (int) Math.random();
    private String name;
    private String imgPath;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
