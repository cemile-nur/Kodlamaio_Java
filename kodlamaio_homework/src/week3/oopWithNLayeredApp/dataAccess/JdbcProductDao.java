package week3.oopWithNLayeredApp.dataAccess;

import week3.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //Sadece db erişim kodları buraya yazılır.. SQL
        System.out.println("JDBC ile veri tabanına eklendi");
    }
}
