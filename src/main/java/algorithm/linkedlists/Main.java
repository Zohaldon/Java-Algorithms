package algorithm.linkedlists;

public class Main {
  public static void main(String[] args){
    testDoublyLinkedList();
    testSinglyLinkedList();
    testRemoveDups();
    testKthFromLast();
    testDeleteMiddleNode();
    testPartition();
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
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    singlyLinkedList.print();
  }

  public static void testKthFromLast(){
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    System.out.println(KthFromLast.getKthFromLast(singlyLinkedList, 3).data);
  }

  public static void testDeleteMiddleNode(){
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    System.out.println("Input: ");
    singlyLinkedList.print();
    SinglyNode<Character> nodeToDelete = singlyLinkedList.head.next.next;
    singlyLinkedList.deleteNode(nodeToDelete);
    System.out.println("\nOutput: ");
    singlyLinkedList.print();
  }

  public static void testPartition(){
    SinglyLinkedList<Integer> singlyLinkedList = generateRandomIntegerSinglyList();
    SinglyLinkedList<Integer> outputList = Partition.partitionSinglyLinkedList(singlyLinkedList, 5);
    System.out.println("\nInput: ");
    singlyLinkedList.print();
    System.out.println("\nOutput: ");
    outputList.print();
  }

  public static SinglyLinkedList<Character> generateAlphabeticalSinglyList(){
    SinglyLinkedList<Character> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.addNode('a');
    singlyLinkedList.addNode('b');
    singlyLinkedList.addNode('c');
    singlyLinkedList.addNode('d');
    singlyLinkedList.addNode('e');
    singlyLinkedList.addNode('f');

    return singlyLinkedList;
  }

  public static SinglyLinkedList<Integer> generateRandomIntegerSinglyList(){
    SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.addNode(3);
    singlyLinkedList.addNode(5);
    singlyLinkedList.addNode(8);
    singlyLinkedList.addNode(5);
    singlyLinkedList.addNode(10);
    singlyLinkedList.addNode(2);
    singlyLinkedList.addNode(1);

    return singlyLinkedList;
  }
}
