package week3.homework.Kodlamaio.business;

import week3.homework.Kodlamaio.core.logging.Logger;
import week3.homework.Kodlamaio.dataAccess.TrainerDao;
import week3.homework.Kodlamaio.entities.Trainer;

import java.util.List;

public class TrainerManager {
    private TrainerDao trainerDao;
    private Logger[] loggers;
    private List<Trainer> trainers;

    public TrainerManager(TrainerDao trainerDao, Logger[] loggers, List<Trainer> trainers) {
        this.trainerDao = trainerDao;
        this.loggers = loggers;
        this.trainers = trainers;
    }

    public void add(Trainer trainer){
        for (Trainer trainerOrder : trainers){
            System.out.println(trainerOrder.getFirstName() + "adlı eğitmen eklendi.");
        }
    }
}
