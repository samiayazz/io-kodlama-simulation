package dao.concrete.hibernate;

import dao.virtual.BaseCategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements BaseCategoryDao {
    @Override
    public List<Category> get() {
        //Hibernate Operations
        return new ArrayList<Category>();
    }

    @Override
    public void add(Category category) {
        //Hibernate Operations
        System.out.println("Hibernate: \"" + category.getName() + "\" adlı kategori oluşturuldu!");
    }

    @Override
    public void update(int oldCategoryId, Category newCategory) {
        //Hibernate Operations
        System.out.println("Hibernate: \"" + newCategory.getName() + "\" adlı kategori güncellendi!");
    }

    @Override
    public void delete(int id) {
        //Hibernate Operations
        System.out.println("Hibernate: Kategori silindi!");
    }
}
