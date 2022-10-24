package dao.virtual;

import entity.Category;

import java.util.List;

public interface BaseCategoryDao {
    List<Category> get();

    boolean isCategoryNameExists(String name);

    void add(Category category);

    void update(int oldCategoryId, Category newCategory);

    void delete(int id);
}
