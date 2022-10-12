package week3.homework.Kodlamaio.dataAccess.Hibernate;

import week3.homework.Kodlamaio.dataAccess.CategoryDao;
import week3.homework.Kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
