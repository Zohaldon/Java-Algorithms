package algorithm.linkedlists;

public class SinglyNode<T> {
  public T data;
  public SinglyNode<T> next;

  SinglyNode(T data){
    this.data = data;
    next = null;
  }
}
