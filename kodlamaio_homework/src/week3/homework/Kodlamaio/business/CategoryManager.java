package week3.homework.Kodlamaio.business;

import week3.homework.Kodlamaio.core.logging.Logger;
import week3.homework.Kodlamaio.dataAccess.CategoryDao;
import week3.homework.Kodlamaio.entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {

        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception{
        for (Category categoryOrder: categories){
            if (categoryOrder.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Kategori ismi aynı olamaz.");
            }
        }

        categoryDao.add(category);
        categories.add(category);

        for (Logger logger: loggers){
            logger.log(category.getCategoryName());
        }
    }
}
