package week3.homework.YoutubeEducation;

public class Main {
    public static void main(String[] args) {
        //IoC container
        CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();
    }
}
