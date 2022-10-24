package dao.virtual;

import entity.Category;

import java.util.List;

public interface BaseCategoryDao {
    List<Category> get();

    void add(Category category);

    void update(int oldCategoryId, Category newCategory);

    void delete(int id);
}
