package week3.homework.Kodlamaio.dataAccess.Jdbc;

import week3.homework.Kodlamaio.dataAccess.CourseDao;
import week3.homework.Kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
}
