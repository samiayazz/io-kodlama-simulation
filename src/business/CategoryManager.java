package business;

import dao.virtual.BaseCategoryDao;
import entity.Category;

import java.util.List;

public class CategoryManager {
    private BaseCategoryDao categoryDao;

    public CategoryManager(BaseCategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Category> get() {
        return categoryDao.get();
    }

    public void add(Category category) {
        categoryDao.add(category);
    }

    public void update(int oldCategoryId, Category newCategory) {
        categoryDao.update(oldCategoryId, newCategory);
    }

    public void delete(int id) {
        categoryDao.delete(id);
    }
}
