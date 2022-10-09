package week3.oopWithNLayeredApp;

import week3.oopWithNLayeredApp.business.ProductManager;
import week3.oopWithNLayeredApp.core.logging.DatabaseLogger;
import week3.oopWithNLayeredApp.core.logging.FileLogger;
import week3.oopWithNLayeredApp.core.logging.Logger;
import week3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import week3.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1= new Product(1,"IPhone Xr",10000);

        Logger[] loggers ={new DatabaseLogger(),new FileLogger()};
        ProductManager productManager=
                new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}
