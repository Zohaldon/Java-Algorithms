// An animal shelter that holds cats and dogs, operates in "Fist In, First Out"
// people can adopt either the oldest animal OR people can adopt the oldest cat or dog
// people are not allowed to select any specific animal

package algorithm.stacksandqueues.AnimalShelter;


import java.util.LinkedList;

public class AnimalShelter {
  private final LinkedList<Dog> dogQueue;
  private final LinkedList<Cat> catQueue;

  public AnimalShelter(){
    dogQueue = new LinkedList<>();
    catQueue = new LinkedList<>();
  }

  public void enqueue(Animal animal){
    if(animal instanceof Dog ){
      dogQueue.addLast((Dog) animal);
    } else {
      catQueue.addLast((Cat) animal);
    }
  }

  public Animal dequeueAny(){
    if(dogQueue.size() == 0 && catQueue.size() == 0){
      return null;
    }

    if(dogQueue.size() == 0){
      return dequeueCat();
    }

    if(catQueue.size() == 0){
      return dequeueDog();
    }

    if(dogQueue.peek().isOlderThan(catQueue.peek())){
      return dequeueDog();
    } else {
      return dequeueCat();
    }
  }

  public Dog dequeueDog(){
    return dogQueue.poll();
  }

  public Cat dequeueCat(){
    return catQueue.poll();
  }
}
