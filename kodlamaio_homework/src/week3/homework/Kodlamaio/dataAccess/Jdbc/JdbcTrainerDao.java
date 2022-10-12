package week3.homework.Kodlamaio.dataAccess.Jdbc;

import week3.homework.Kodlamaio.dataAccess.TrainerDao;
import week3.homework.Kodlamaio.entities.Trainer;

public class JdbcTrainerDao implements TrainerDao {
    @Override
    public void add(Trainer trainer) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
}
