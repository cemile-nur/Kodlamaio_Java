package week3.homework.Kodlamaio;

import week3.homework.Kodlamaio.business.CategoryManager;
import week3.homework.Kodlamaio.business.CourseManager;
import week3.homework.Kodlamaio.business.TrainerManager;
import week3.homework.Kodlamaio.core.logging.DatabaseLogger;
import week3.homework.Kodlamaio.core.logging.Logger;
import week3.homework.Kodlamaio.dataAccess.Hibernate.HibernateCategoryDao;
import week3.homework.Kodlamaio.dataAccess.Hibernate.HibernateCourseDao;
import week3.homework.Kodlamaio.dataAccess.Jdbc.JdbcTrainerDao;
import week3.homework.Kodlamaio.entities.Category;
import week3.homework.Kodlamaio.entities.Course;
import week3.homework.Kodlamaio.entities.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger()};
        Category categoryElement1 = new Category(1,"Yazılım");
        List<Category> categories = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
        categoryManager.add(categoryElement1);

        Course course1 = new Course(1,15.00,"Java","Engin Demiroğ");
        List<Course> courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courses);
        courseManager.add(course1);

        Trainer trainer = new Trainer(1,"Engin ","Demiroğ");
        List<Trainer> trainers = new ArrayList<>();
        TrainerManager trainerManager = new TrainerManager(new JdbcTrainerDao(),loggers,trainers);
        trainerManager.add(trainer);
    }
}
