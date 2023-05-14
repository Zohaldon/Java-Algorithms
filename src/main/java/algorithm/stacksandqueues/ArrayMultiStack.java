// Using array to implement three stacks

package algorithm.stacksandqueues;

import java.rmi.NoSuchObjectException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

public class ArrayMultiStack {
  private final int numberOfStacks = 3;
  // How big should 3 stacks be?
  private final int stackCapacity;
  // Values to be made available
  private final int[] values;
  // How much length each stack is occupying
  private final int[] sizes;

  public ArrayMultiStack(int capacity){
    // TODO: handle invalid value for capacity
    // create 3 stacks of specified length
    stackCapacity = capacity;
    values = new int[numberOfStacks * capacity];
    sizes = new int[capacity];
  }

  public void push(int stackNum, int value){
    // TODO: Handle invalid stackNum value
    if(sizes[stackNum] >= stackCapacity ){
      throw new StackOverflowError("Stack is already at its full capacity");
    }

    int indexToAdd = getIndexOfTop(stackNum);
    values[indexToAdd] = value;
    sizes[stackNum] += 1;
  }

  public Integer pop(int stackNum) throws NoSuchObjectException {
    if (stackNum > numberOfStacks)
      throw new NoSuchObjectException("");

    if (sizes[stackNum] == 0)
      return null;

    int indexToRemove = getIndexOfTop(stackNum) - 1;
    int result = values[indexToRemove];
    values[indexToRemove] = 0;
    sizes[stackNum] -= 1;
    return result;
  }

  public void printAll(){
    System.out.println(Arrays.toString(values));
  }

  private Integer getIndexOfTop(int stackNum){
    int sizeRemaining = stackCapacity - sizes[stackNum];
    return ((stackNum + 1) * stackCapacity) - sizeRemaining;
  }
}
