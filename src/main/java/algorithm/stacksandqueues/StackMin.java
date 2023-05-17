// A Stack that can return the min node in O(1) time while maintaining O(1) runtime for Pop and Push
package algorithm.stacksandqueues;

import java.util.Objects;

public class StackMin {
  private final AStack minStack = new AStack();
  private DataNode<Integer> minNode = null;

  private DataNode<Integer> top = null;

  private int size = 0;
  public void push(int data){
    DataNode<Integer> newNode = new DataNode<>(data);

    if(size == 0){
      top = minNode = newNode;
      minStack.push(newNode.data);
      size++;
      return;
    }

    if(newNode.data < minNode.data){
      minNode = newNode;
      minStack.push(minNode.data);
    }

    newNode.next = top;
    top = newNode;
    size++;
  }

  public DataNode<Integer> pop(){
    DataNode<Integer> nextTop = top.next;
    DataNode<Integer> currentTop = top;

    if(Objects.equals(top.data, minNode.data)){
      minStack.pop();
      minNode = minStack.peek();
    }
    top = nextTop;
    size--;
    return currentTop;
  }

  public DataNode<Integer> min(){
    return minStack.peek();
  }

  public DataNode<Integer> peek(){
    return top;
  }

  public void printAll(){
    if (size == 0)
      return;

    System.out.print("Stack: ");
    DataNode<Integer> currentNode = top;
    for(int i = 0; i < size; i++){
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }
}
