package week3.oopWithNLayeredApp.business;

import week3.oopWithNLayeredApp.core.logging.Logger;
import week3.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import week3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import week3.oopWithNLayeredApp.dataAccess.ProductDao;
import week3.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() <10){
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger :loggers){ //[db,mail]
           logger.log(product.getName());
        }
    }
}
