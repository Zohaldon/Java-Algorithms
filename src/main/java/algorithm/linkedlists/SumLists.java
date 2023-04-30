// Given two numbers represented in a linked list format, where one node = single digit and numbers are stored in
// reversed order, the algorithm returns sum of the numbers in a linked list format
package algorithm.linkedlists;

public class SumLists {
  // Runtime: O (N * M)
  public static SinglyLinkedList<Integer> sumLinkedListReverse(SinglyLinkedList<Integer> firstList, SinglyLinkedList<Integer> secondList){
    SinglyLinkedList<Integer> answerList = new SinglyLinkedList<>();
    if(firstList.size() < 1  && secondList.size() < 1)
      return answerList;

    SinglyNode<Integer> firstListNode = firstList.head;
    SinglyNode<Integer> secondListNode = secondList.head;
    int carryOver = 0;
    while(firstListNode != null || secondListNode != null){
      int firstNodeData = firstListNode == null ? 0 : firstListNode.data;
      int secondNodeData = secondListNode == null ? 0 : secondListNode.data;

      carryOver = addNodes(answerList, firstNodeData, secondNodeData, carryOver);

      firstListNode = firstListNode == null ? null : firstListNode.next;
      secondListNode = secondListNode == null ? null : secondListNode.next;
    }

    if(carryOver > 0)
      answerList.addNode(carryOver);

    return answerList;
  }

  private static Integer addNodes(SinglyLinkedList<Integer> answerList, int val1, int val2, int carryOver){
    int sum = val1 + val2 + carryOver;
    int tensPlace = (sum/10)%10;
    int unitPlace = (sum)%10;
    answerList.addNode(unitPlace);

    return tensPlace;
  }
}
