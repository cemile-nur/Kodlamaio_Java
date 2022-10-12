package week3.homework.Kodlamaio.entities;

public class Course {
    private int id;
    private double price;
    private String courseName, courseTrainer;

    public Course(int id, double price, String courseName, String courseTrainer) {
        this.id = id;
        this.price = price;
        this.courseName = courseName;
        this.courseTrainer = courseTrainer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTrainer() {
        return courseTrainer;
    }

    public void setCourseTrainer(String courseTrainer) {
        this.courseTrainer = courseTrainer;
    }
}
