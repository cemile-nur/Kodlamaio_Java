package week3.homework.Kodlamaio.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Database'den loglandı.");
    }
}
