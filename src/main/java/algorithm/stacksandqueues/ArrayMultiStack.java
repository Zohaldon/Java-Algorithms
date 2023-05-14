// Using array to implement three stacks

package algorithm.stacksandqueues;

import java.util.Arrays;

public class ArrayMultiStack {
  private int numberOfStacks = 3;
  // How big should 3 stacks be?
  private int stackCapacity;
  // Values to be made available
  private int[] values;
  // How much length each stack is occupying
  private int[] sizes;

  public ArrayMultiStack(int capacity){
    // create 3 stacks of specified length
    stackCapacity = capacity;
    values = new int[numberOfStacks * capacity];
    sizes = new int[capacity];
  }

  public void push(int stackNum, int value){
    if(sizes[stackNum] >= stackCapacity ){
      throw new StackOverflowError("Stack is already at its full capacity");
    }

    int indexToAdd = getIndexOfTop(stackNum);
    values[indexToAdd] = value;
    sizes[stackNum] += 1;
  }

  public Integer pop(int stackNum){
    int result = 0;

    if(sizes[stackNum] > 0){
      int returnIndex = getIndexOfTop(stackNum);
      result = values[returnIndex];
      values[returnIndex] = 0;
      sizes[stackNum] -= 1;
    }
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
