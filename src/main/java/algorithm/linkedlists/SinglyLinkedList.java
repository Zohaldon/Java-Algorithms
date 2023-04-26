package algorithm.linkedlists;

public class SinglyLinkedList {
  Node head, tail = null;
  private int size = 0;
  public static class Node {
    public char data;
    public Node next;

    Node(char data){
      this.data = data;
      next = null;
    }
  }
  public int size(){
    return size;
  }

  public void addNode(char data){
    Node node = new Node(data);

    if(head == null){
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }

    size++;
  }

  public void print(){
    Node current = head;
    for(int i = 0; i < size; i++){
     System.out.print(current.data + " -> ");
     current = current.next;
    }
  }
}
