// An algorithm to partition a linkedList around value x,
// such that all nodes less than x come before all nodes greater or equal to x
package algorithm.linkedlists;

public class Partition {
  public static SinglyLinkedList<Integer> partitionSinglyLinkedList(SinglyLinkedList<Integer> linkedList, int value){
    // Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
    // Output (one of the many valid outputs): 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
    if(linkedList.size() < 2)
      return linkedList;

    SinglyNode<Integer> current = linkedList.head;
    SinglyLinkedList<Integer> smallerValues = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> greaterOrEqualValues = new SinglyLinkedList<>();
    for(int i = 0; i < linkedList.size(); i++){
      if(current.data < value){
        smallerValues.addNode(current.data);
      } else {
        greaterOrEqualValues.addNode(current.data);
      }
      current = current.next;
    }

    SinglyNode<Integer> currentNode = greaterOrEqualValues.head;
    for(int i = 0; i < greaterOrEqualValues.size(); i ++){
      smallerValues.addNode(currentNode.data);
      currentNode = currentNode.next;
    }

    return smallerValues;
  }
}
