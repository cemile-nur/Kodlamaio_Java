package week2.homework.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
       CreditUI creditUI = new CreditUI();
       creditUI.creditCalculate(new TeacherCreditManager());

    }
}
