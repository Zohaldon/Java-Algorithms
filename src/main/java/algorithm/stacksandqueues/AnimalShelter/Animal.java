package algorithm.stacksandqueues.AnimalShelter;

import java.time.LocalDateTime;

public abstract class Animal {
  private final LocalDateTime arrivalTime;
  private final String name;
  public Animal(String name) throws InterruptedException {
    Thread.sleep(1000);
    this.name = name;
    this.arrivalTime = LocalDateTime.now();
  }

  public boolean isOlderThan(Animal otherAnimal){
    return this.arrivalTime.isBefore(otherAnimal.arrivalTime);
  }

  public String name(){
    return this.name;
  }
}
