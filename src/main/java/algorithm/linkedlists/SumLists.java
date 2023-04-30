// Given two numbers represented in a linked list format, where one node = single digit and numbers are stored in
// reversed order, the algorithm returns sum of the numbers in a linked list format
package algorithm.linkedlists;

import java.util.ArrayList;
import java.util.List;

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

  // Runtime - O(N), where N is the size of largest list
  public static  SinglyLinkedList<Integer> sumLinkedList(SinglyLinkedList<Integer> firstList, SinglyLinkedList<Integer> secondList){
    SinglyLinkedList<Integer> answer = new SinglyLinkedList<>();
    if(firstList.size() < 1 && secondList.size() < 1)
      return answer;

    padLists(firstList, secondList);
    List<Integer> summationAtPlace = new ArrayList<Integer>();
    SinglyNode<Integer> firstListNode = firstList.head;
    SinglyNode<Integer> secondListNode = secondList.head;
    while(firstListNode != null || secondListNode != null){
      int firstNodeData = firstListNode == null ? 0 : firstListNode.data;
      int secondNodeData = secondListNode == null ? 0 : secondListNode.data;

      summationAtPlace.add(firstNodeData + secondNodeData);

      firstListNode = firstListNode == null ? null : firstListNode.next;
      secondListNode = secondListNode == null ? null : secondListNode.next;
    }

    return buildAnswer(summationAtPlace, answer);
  }

  private static void padLists(SinglyLinkedList<Integer> firstList, SinglyLinkedList<Integer> secondList){
    // For summing list in forward way we would need to add 0 as padding to account for missing integers on smaller lists
    if(firstList.size() == secondList.size()){
      return;
    } else if (firstList.size() > secondList.size()) {
      padList(secondList, firstList.size() - secondList.size());
    } else{
      padList(firstList, secondList.size() - firstList.size());
    }

  }

  private static void padList(SinglyLinkedList<Integer> list, int padding){
    for(int i = 0; i < padding; i++){
      list.addNodeToHead(0);
    }
  }
  private static SinglyLinkedList<Integer> buildAnswer(List<Integer> summationAtPlace, SinglyLinkedList<Integer> answer){
    int carryOver = 0;

    for(int i = 0; i < summationAtPlace.size(); i++){
      int sum = summationAtPlace.get(summationAtPlace.size() - i -1) + carryOver;
      int unitPlace = sum%10;
      carryOver = (sum/10)%10;
      answer.addNodeToHead(unitPlace);
    }

    if(carryOver > 0)
      answer.addNodeToHead(carryOver);
    return answer;
  }
}
