package algorithm.linkedlists;

public class Main {
  public static void main(String[] args){
    testDoublyLinkedList();
    testSinglyLinkedList();
    testRemoveDups();
    testKthFromLast();
    testDeleteMiddleNode();
    testPartition();
    testSumReverse();
    testSum();
  }

  public static void testRemoveDups(){
    System.out.println("\n\n==================Test Remove Duplicate Node==================");
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
    System.out.println("\n\n==================Test Doubly Linked List Implementation==================");
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
    System.out.println("\n==================Test Singly Linked List Implementation==================");
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    singlyLinkedList.print();
  }

  public static void testKthFromLast(){
    System.out.println("\n\n==================Test Kth From Last Node==================");
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    System.out.println("Input:");
    singlyLinkedList.print();
    int kthFromLast = 3;
    System.out.println("\n" + kthFromLast + "th From last(index starts from 0): " + KthFromLast.getKthFromLast(singlyLinkedList, kthFromLast).data);
  }

  public static void testDeleteMiddleNode(){
    System.out.println("\n\n==================Test Delete Middle Node==================");
    SinglyLinkedList<Character> singlyLinkedList = generateAlphabeticalSinglyList();
    System.out.println("Input: ");
    singlyLinkedList.print();
    SinglyNode<Character> nodeToDelete = singlyLinkedList.head.next.next;
    singlyLinkedList.deleteNode(nodeToDelete);
    System.out.println("\nOutput: ");
    singlyLinkedList.print();
  }

  public static void testPartition(){
    System.out.println("\n\n==================Test Partition List by Given Node==================");
    SinglyLinkedList<Integer> singlyLinkedList = generateRandomIntegerSinglyList();
    SinglyLinkedList<Integer> outputList = Partition.partitionSinglyLinkedList(singlyLinkedList, 5);
    System.out.println("\nInput: ");
    singlyLinkedList.print();
    System.out.println("\nOutput: ");
    outputList.print();
  }

  public static void testSumReverse(){
    System.out.println("\n\n==================Test Sum Reverse==================");
    SinglyLinkedList<Integer> firstList = new SinglyLinkedList<>();
    firstList.addNode(2);
    firstList.addNode(5);


    SinglyLinkedList<Integer> secondList = new SinglyLinkedList<>();
    secondList.addNode(5);
    secondList.addNode(1);
    secondList.addNode(6);

    System.out.print("Inputs: \n");
    firstList.print();
    System.out.println();
    secondList.print();
    System.out.println("\nOutput: ");
    SumLists.sumLinkedListReverse(firstList, secondList).print();
  }

  public static void testSum(){
    System.out.println("\n\n==================Test Sum==================");
    SinglyLinkedList<Integer> firstList = new SinglyLinkedList<>();
    firstList.addNode(9);
    firstList.addNode(9);
    firstList.addNode(9);


    SinglyLinkedList<Integer> secondList = new SinglyLinkedList<>();
    secondList.addNode(5);
    secondList.addNode(9);
    secondList.addNode(6);

    System.out.print("Inputs: \n");
    firstList.print();
    System.out.println();
    secondList.print();
    System.out.println("\nOutput: ");
    SumLists.sumLinkedList(firstList, secondList).print();
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
