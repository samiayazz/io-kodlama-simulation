package dao.concrete.jdbc;

import dao.virtual.BaseCategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class JDBCCategoryDao implements BaseCategoryDao {
    @Override
    public List<Category> get() {
        //JDBC Operations
        return new ArrayList<Category>();
    }

    public boolean isCategoryNameExists(String name) {
        //Control
        return false;
    }

    @Override
    public void add(Category category) {
        //JDBC Operations
        System.out.println("JDBC: \"" + category.getName() + "\" adlı kategori oluşturuldu!");
    }

    @Override
    public void update(int oldCategoryId, Category newCategory) {
        //JDBC Operations
        System.out.println("JDBC: \"" + newCategory.getName() + "\" adlı kategori güncellendi!");
    }

    @Override
    public void delete(int id) {
        //JDBC Operations
        System.out.println("JDBC: Kategori silindi!");
    }
}
