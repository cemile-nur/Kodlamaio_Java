package week3.oopWithNLayeredApp.dataAccess;

import week3.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //Sadece db erişim kodları buraya yazılır.. SQL
        System.out.println("Hibernate ile veri tabanina eklendi");
    }
}
