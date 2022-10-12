package week3.homework.Kodlamaio.dataAccess.Jdbc;

import week3.homework.Kodlamaio.dataAccess.CategoryDao;
import week3.homework.Kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
}
