package entity;

public class Course {
    public Course() {
    }

    public Course(String name, String imgPath) {
        setName(name);
        setImgPath(imgPath);
    }

    private int id = generateRandomId();
    private Category category;
    private String name;
    private String imgPath;

    private int generateRandomId() {
        double id = Math.random() * 100;
        return (int) id;
    }

    public int getId() {

        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
