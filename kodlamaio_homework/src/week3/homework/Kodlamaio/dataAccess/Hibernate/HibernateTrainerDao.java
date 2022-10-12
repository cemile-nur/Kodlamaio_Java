package week3.homework.Kodlamaio.dataAccess.Hibernate;

import week3.homework.Kodlamaio.dataAccess.TrainerDao;
import week3.homework.Kodlamaio.entities.Trainer;

public class HibernateTrainerDao implements TrainerDao {
    @Override
    public void add(Trainer trainer) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
