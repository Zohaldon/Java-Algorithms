// Implementation of stack data structure
// Stack = Dishes
package algorithm.stacksandqueues;

import java.util.EmptyStackException;

public class MyStack<T> {
  DataNode<T> top = null;

  public T pop(){
    if(top == null) throw new EmptyStackException();

    T item = top.data;
    top = top.next;
    return item;
  }

  public void push(T item){
    DataNode<T> node = new DataNode<>(item);
    node.next = top;
    top = node;
  }

  public T peek(){
    if(top == null) throw new EmptyStackException();

    return top.data;
  }

  public boolean isEmpty(){
    return top == null;
  }
}
