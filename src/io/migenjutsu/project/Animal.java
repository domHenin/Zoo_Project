package io.migenjutsu.project;

public class Animal extends Zoo {
    private String animalGroup; //list:: invertebrates, fish, amphibians, reptiles, birds, mammals
    private String animalType; //list:: small, medium, large


    public Animal(int yearOpened, int numOfAnimals, int numOfWorkers, int numOfConsumer, String zooName, String animalGroup, String animalType) {
        super(yearOpened, numOfAnimals, numOfWorkers, numOfConsumer, zooName);
        this.animalGroup = animalGroup;
        this.animalType = animalType;
    }
}
