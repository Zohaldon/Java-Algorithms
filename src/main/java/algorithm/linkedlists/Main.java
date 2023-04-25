package algorithm.linkedlists;

public class Main {
  public static void main(String[] args){
    // test code goes here666
//    testDoublyLinkedList();
    testRemoveDups();
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
}
