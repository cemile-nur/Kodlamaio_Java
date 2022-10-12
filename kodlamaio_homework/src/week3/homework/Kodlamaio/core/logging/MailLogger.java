package week3.homework.Kodlamaio.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Maile loglandı.");
    }
}
