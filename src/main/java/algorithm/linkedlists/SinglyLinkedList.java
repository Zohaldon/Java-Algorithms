package algorithm.linkedlists;

public class SinglyLinkedList<T> {
  SinglyNode<T> head, tail = null;
  private int size = 0;
  public int size(){
    return size;
  }

  public void addNode(T data){
    SinglyNode<T> node = new SinglyNode<>(data);

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

  public SinglyNode<T> getNodeAtIndex(int index){
    if(index > size || head == null || index < 0)
      throw new ArrayIndexOutOfBoundsException();

    SinglyNode<T> current = head;

    for(int i = 0; i <= index; i++){
      if(i == index)
        break;
      current = current.next;
    }

    return current;
  }

  public void deleteNode(SinglyNode<T> nodeToDelete){
    // An Algorithm that deletes the node of a singly linked list
    // Example: Delete node c for a -> b -> c -> d -> e -> f -> results in a -> b -> d -> e -> f ->
    if(size == 0)
      return;
    if(size == 1){
      head = tail = null;
      size--;
    } else if(size == 2){
      tail = nodeToDelete;
      head.next = null;
      size--;
    } else {
      SinglyNode<T> prevNode = null;
      SinglyNode<T> current = head;
      SinglyNode<T> nextNode;

      for(int i = 0; i < size; i++){
        nextNode = current.next;
        if(current == nodeToDelete){
          if(current ==  head){
            head = nextNode;
          } else if(current == tail){
            tail = prevNode;
            tail.next = null;
          } else {
            prevNode.next = nextNode;
          }

          size--;
          break;
        }
        prevNode = current;
        current = current.next;
      }
    }
  }

  public void addNodeToHead(T data){
    if(size == 0){
      addNode(data);
    } else {
      SinglyNode<T> node = new SinglyNode<>(data);
      node.next = head;
      head = node;
      size++;
    }
  }
}
