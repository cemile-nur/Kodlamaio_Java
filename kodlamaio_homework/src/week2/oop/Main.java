package week2.oop;

public class Main {
    public static void main(String[] args) {
        String message ="Vade Oranı";

        Product product1= new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image.jpg");

        Product product2= new Product();
        product2.setName("Delonghi Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(4500);
        product2.setUnitInStock(3);
        product2.setImageUrl("image1.jpg");

        Product product3= new Product();
        product3.setName("Smeg Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(8500);
        product3.setUnitInStock(3);
        product3.setImageUrl("image2.jpg");


        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products){
            System.out.println("<li>" + product.getName()  + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("054245646");
        individualCustomer.setCustomerNumber("2345");
        individualCustomer.setFirstName("Cemile Nur");
        individualCustomer.setLastName("keklik");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama");
        corporateCustomer.setPhone("6545313");
        corporateCustomer.setTaxNumber("11111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers={individualCustomer,corporateCustomer};

    }
}
