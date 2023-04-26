package algorithm.linkedlists;

public class Main {
  public static void main(String[] args){
    testDoublyLinkedList();
    testSinglyLinkedList();
    testRemoveDups();
    testKthFromLast();
  }

  public static void testRemoveDups(){
    DoublyLinkedList inputLinkedList = new DoublyLinkedList();
    inputLinkedList.addNode('a');
    inputLinkedList.addNode('b');
    inputLinkedList.addNode('a');
    inputLinkedList.addNode('b');
    inputLinkedList.addNode('c');

    System.out.println("Input: ");
    inputLinkedList.printLinkedList();
    System.out.println();
    DoublyLinkedList result = RemoveDups.removeDuplicates(inputLinkedList);
    System.out.println("Output: ");
    result.printLinkedList();
    System.out.println();
  }

  public static void testDoublyLinkedList(){
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.addNode('A');
    doublyLinkedList.addNode('B');
    doublyLinkedList.addNode('C');

    doublyLinkedList.printLinkedList();
    System.out.println();
    System.out.println(doublyLinkedList.size());

    System.out.println("Remove a node:");
    doublyLinkedList.removeNodeAtIndex(1);

    doublyLinkedList.printLinkedList();
    System.out.println();
    System.out.println(doublyLinkedList.size());
  }

  public static void testSinglyLinkedList(){
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.addNode('a');
    singlyLinkedList.addNode('b');

    singlyLinkedList.print();
  }

  public static void testKthFromLast(){
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.addNode('a');
    singlyLinkedList.addNode('b');

    System.out.println(singlyLinkedList.returnKthFromLast(3).data);
  }
}
