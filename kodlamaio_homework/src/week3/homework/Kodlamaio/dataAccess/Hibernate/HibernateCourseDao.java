package week3.homework.Kodlamaio.dataAccess.Hibernate;

import week3.homework.Kodlamaio.dataAccess.CourseDao;
import week3.homework.Kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
