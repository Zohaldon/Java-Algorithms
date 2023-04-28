package algorithm.linkedlists;

public class Main {
  public static void main(String[] args){
    testDoublyLinkedList();
    testSinglyLinkedList();
    testRemoveDups();
    testKthFromLast();
  }

  public static void testRemoveDups(){
    DoublyLinkedList<Character> inputLinkedList = new DoublyLinkedList<>();
    inputLinkedList.addNode('a');
    inputLinkedList.addNode('b');
    inputLinkedList.addNode('a');
    inputLinkedList.addNode('b');
    inputLinkedList.addNode('c');

    System.out.println("Input: ");
    inputLinkedList.printLinkedList();
    System.out.println();
    DoublyLinkedList<Character> result = RemoveDups.removeDuplicates(inputLinkedList);
    System.out.println("Output: ");
    result.printLinkedList();
    System.out.println();
  }

  public static void testDoublyLinkedList(){
    DoublyLinkedList<Character> doublyLinkedList = new DoublyLinkedList<>();
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
    SinglyLinkedList<Character> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.addNode('a');
    singlyLinkedList.addNode('b');

    singlyLinkedList.print();
  }

  public static void testKthFromLast(){
    SinglyLinkedList<Character> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.addNode('a');
    singlyLinkedList.addNode('b');
    singlyLinkedList.addNode('c');
    singlyLinkedList.addNode('d');
    singlyLinkedList.addNode('e');


    System.out.println(KthFromLast.getKthFromLast(singlyLinkedList, 3).data);
  }
}
