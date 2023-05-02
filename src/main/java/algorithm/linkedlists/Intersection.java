// An algorithm that returns the node where two lists singly linked intersect
// Example: 1 -> 2 -> 3 -> 4 -> 5 -> 6
//               5 -> ↑ -> 4 -> 5 -> 6
package algorithm.linkedlists;

public class Intersection {
  public static SinglyNode<Integer> findIntersection(SinglyLinkedList<Integer> firstList, SinglyLinkedList<Integer> secondList){
    if(firstList.tail != secondList.tail || firstList.size() == 0 || secondList.size() == 0)
      return null;

    if(firstList.size() == secondList.size())  {
      return getIntersection(firstList, secondList);
    } else if (firstList.size() > secondList.size()) {
      return getIntersection(firstList, secondList);
    } else {
      return getIntersection(secondList, firstList);
    }
  }

  private static SinglyNode<Integer> getIntersection(SinglyLinkedList<Integer> biggerList, SinglyLinkedList<Integer> smallerList){
    int cutoff = biggerList.size() - smallerList.size();
    SinglyNode<Integer> biggerListNode = biggerList.head;
    SinglyNode<Integer> smallerListNode = smallerList.head;
    SinglyNode<Integer> answer = null;
    for(int i = 0; i < biggerList.size(); i++){
      if(cutoff > 0){
        biggerListNode = biggerListNode.next;
        cutoff--;
      } else {
        if(biggerListNode == smallerListNode){
          answer =  biggerListNode;
          break;
        }

        biggerListNode = biggerListNode.next;
        smallerListNode = smallerListNode.next;
      }
    }

    return answer;
  }
}
