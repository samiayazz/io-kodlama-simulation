package entity;

public class Category {
    public Category() {
    }

    public Category(String name) {
        setName(name);
    }

    private int id = generateRandomId();
    private String name;

    private int generateRandomId() {
        double id = Math.random() * 100;
        return (int) id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
