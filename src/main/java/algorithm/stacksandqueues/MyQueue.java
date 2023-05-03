package algorithm.stacksandqueues;

import java.util.NoSuchElementException;

public class MyQueue<T> {
  DataNode<T> first, last = null;


  public void add(T data){
    DataNode<T> node = new DataNode<>(data);
    if(first == null){
      first = last = node;
    } else {
      last.next = node;
      last = node;
    }
  }

  public T remove(){
    if(first == null) throw new NoSuchElementException();
    T data = first.data;

    first = first.next;
    if(first == null) {
      last = null;
    }
    return data;
  }

  public T peek(){
    if(first == null) throw new NoSuchElementException();

    return first.data;
  }

  public boolean isEmpty(){
    return first == null;
  }
}
