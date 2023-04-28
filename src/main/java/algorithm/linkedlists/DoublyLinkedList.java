package algorithm.linkedlists;

public class DoublyLinkedList<T> {
  // Starting and ending node of the DoublyLinkedList
  DoublyNode<T> head, tail = null;
  private int size = 0;

  public int size() {
    return size;
  }

  public void addNode(T data){
    DoublyNode<T> newNode = new DoublyNode<>(data);

    if(head == null){
      head = tail = newNode;

      head.prev = null;
      head.next = null;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }

    size++;
  }

  public void removeNodeAtIndex(int removeIndex){
    DoublyNode<T> nodeToRemove = head;
    if(removeIndex <= size - 1){
      for(int i = 0; i < size; i++){
        if(i == removeIndex){
          removeNode(nodeToRemove);
          break;
        }
        nodeToRemove = nodeToRemove.next;
      }
    }
  }

  public void removeNode(DoublyNode<T> node){
    if(size == 1){
      head = tail = null;
      size = 0;
    } else {
      // A --> B --> C --> Null
      // Null <-- A <-- B <-- C

      // prevNode -> node -> nextNode
      DoublyNode<T> prevNode = node.prev;
      DoublyNode<T> nextNode = node.next;
      if(prevNode == null){
        // we are dealing with head
        nextNode.prev = null;
        head = nextNode;
      } else if (nextNode == null) {
        // we are dealing with tail
        prevNode.next = null;
        tail = prevNode;
      } else {
        // we are dealing with middle node
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
      }

      size--;
    }
  }

  public DoublyNode<T> get(int index){
    if(size == 0 || index > size)
      return null;

    DoublyNode<T> current = head;
    for(int i = 0; i < size; i++){
      if(i == index)
        break;
      current = current.next;
    }

    return current;
  }

  public void printLinkedList(){
    if(head == null){
      System.out.println("Doubly LinkedList is empty");
    } else {
      DoublyNode<T> current = head;
      while(current != null){
        System.out.print(current.data + " -> ");
        current = current.next;
      }
    }
  }
}
