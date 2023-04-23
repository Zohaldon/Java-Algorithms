package algorithm.linkedlists;

public class DoublyLinkedList {
  // Starting and ending node of the DoublyLinkedList
  Node head, tail = null;
  public int size = 0;

  static class Node {
    public Node prev;
    public Node next;
    public char data;

    Node(char data){
      this.data = data;
      next = null;
      prev = null;
    }
  }

  public void addNode(char data){
    Node newNode = new Node(data);

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
    Node nodeToRemove = head;
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

  private void removeNode(Node node){
    if(size == 1){
      head = tail = null;
      size = 0;
    } else {
      // A --> B --> C --> Null
      // Null <-- A <-- B <-- C

      // prevNode -> node -> nextNode
      Node prevNode = node.prev;
      Node nextNode = node.next;
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

  public void printLinkedList(){
    if(head == null){
      System.out.println("Doubly LinkedList is empty");
    } else {
      Node current = head;
      while(current != null){
        System.out.print(current.data + " -> ");
        current = current.next;
      }
    }
  }
}
