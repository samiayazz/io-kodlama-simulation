package entity;

public class Course {
    public Course() {
    }

    public Course(Category category, Educator educator, String name, String imgPath) {
        setCategory(category);
        setEducator(educator);
        setName(name);
        setImgPath(imgPath);
    }

    private int id = generateRandomId();
    private Category category;
    private Educator educator;
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

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
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
