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

    public void add(Category category) throws Exception {
        if (categoryDao.isCategoryNameExists(category.getName())) categoryDao.add(category);
        else throw new Exception("Hata: Bu kategori adıyla daha önce sistemde bir kayıt oluşturulmuş.");
    }

    public void update(int oldCategoryId, Category newCategory) throws Exception {
        if (categoryDao.isCategoryNameExists(newCategory.getName())) categoryDao.update(oldCategoryId, newCategory);
        else throw new Exception("Hata: Bu kategori adıyla daha önce sistemde bir kayıt oluşturulmuş.");
    }

    public void delete(int id) {
        categoryDao.delete(id);
    }
}
