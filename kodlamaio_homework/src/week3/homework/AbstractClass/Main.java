package week3.homework.AbstractClass;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager();
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
