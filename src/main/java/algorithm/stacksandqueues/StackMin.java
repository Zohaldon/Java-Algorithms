// A Stack that can return the min node in O(1) time while maintaining O(1) runtime for Pop and Push
package algorithm.stacksandqueues;

import java.util.Arrays;

public class StackMin {
  private AStack minStack = new AStack();
  private DataNode<Integer> minNode = null;

  private DataNode<Integer> top = null;

  private int size = 0;
  public void push(int data){
    DataNode<Integer> newNode = new DataNode<>(data);

    if(top == null){
      top = minNode = newNode;
      minStack.push(minNode);
    } else {
      newNode.next = top;
      top = newNode;
      if(newNode.data < minNode.data){
        minStack.push(newNode);
        minNode = newNode;
      }
    }
    size++;
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
