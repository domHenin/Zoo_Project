package io.migenjutsu.project;

public class Animal extends Zoo {
    private int animalId;
    private String animalGroup; //list:: invertebrates, fish, amphibians, reptiles, birds, mammals
    private String animalType; //list:: small, medium, large
    private String animalName;

    public Animal(int animalId, String animalGroup, String animalType, String animalName) {
        this.animalId = animalId;
        this.animalGroup = animalGroup;
        this.animalType = animalType;
        this.animalName = animalName;
    }

    //SETTERS:
    public void setAnimalGroup(String animalGroup) { this.animalGroup = animalGroup; }
    public void setAnimalType(String animalType) { this.animalType = animalType; }
    public void setAnimalId(int animalId) { this.animalId = animalId; }
    public void setAnimalName(String animalName) { this.animalName = animalName; }

    //GETTERS:
    public String getAnimalGroup() { return animalGroup; }
    public String getAnimalType() { return animalType; }
    public int getAnimalId() { return animalId; }
    public String getAnimalName() { return animalName; }

    @Override
    void numberOfAnimals() {

    }
}
