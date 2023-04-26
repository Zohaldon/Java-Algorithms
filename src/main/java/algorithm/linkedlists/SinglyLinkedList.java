package algorithm.linkedlists;

public class SinglyLinkedList<T> {
  SinglyNode<T> head, tail = null;
  private int size = 0;
  public int size(){
    return size;
  }

  public void addNode(T data){
    SinglyNode<T> node = new SinglyNode<T>(data);

    if(head == null){
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }

    size++;
  }

  public void print(){
    SinglyNode<T> current = head;
    for(int i = 0; i < size; i++){
     System.out.print(current.data + " -> ");
     current = current.next;
    }
  }
}
