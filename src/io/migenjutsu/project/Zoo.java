package io.migenjutsu.project;

public class Zoo {
    private int yearOpened;
    private int numOfAnimals;
    private int numOfWorkers;
    private int numOfConsumer;
    private String zooName;

    public Zoo(int yearOpened, int numOfAnimals, int numOfWorkers, int numOfConsumer, String zooName) {
        setYearOpened(yearOpened);
        setNumOfAnimals(numOfAnimals);
        setNumOfWorkers(numOfWorkers);
        setNumOfConsumer(numOfConsumer);
        setZooName(zooName);
    }

    public void setYearOpened(int yearOpened) { this.yearOpened = yearOpened; }
    public void setNumOfAnimals(int numOfAnimals) { this.numOfAnimals = numOfAnimals; }
    public void setNumOfWorkers(int numOfWorkers) { this.numOfWorkers = numOfWorkers; }
    public void setNumOfConsumer(int numOfConsumer) { this.numOfConsumer = numOfConsumer; }
    public void setZooName(String zooName) { this.zooName = zooName; }

    public int getYearOpened() { return yearOpened; }
    public int getNumOfAnimals() { return numOfAnimals; }
    public int getNumOfWorkers() { return numOfWorkers; }
    public int getNumOfConsumer() { return numOfConsumer; }
    public String getZooName() { return zooName; }
}
