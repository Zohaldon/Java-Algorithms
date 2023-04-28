package algorithm.linkedlists;

public class DoublyNode<T> {
  public DoublyNode<T> prev;
  public DoublyNode<T> next;
  public T data;

  DoublyNode(T data){
    this.data = data;
    next = null;
    prev = null;
  }
}
