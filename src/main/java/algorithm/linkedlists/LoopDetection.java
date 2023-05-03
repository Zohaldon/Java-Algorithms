// An algorithm that checks for possible loop present in a singly linked list
package algorithm.linkedlists;

public class LoopDetection {
  public static SinglyNode<Integer> detectLoop(SinglyLinkedList<Integer> list){
    // If a linked list keeps track of tail then it is possible to get the repeating node by doing tail.next
    // The solution here assumes that the data about tail is not made available
    SinglyNode<Integer> slowerNode = list.head;
    SinglyNode<Integer> fasterNode = list.head;
    boolean firstRun = true;
    while(true){
      if(fasterNode == null)
        return null;

      if(slowerNode == fasterNode && !firstRun)
        break;

      slowerNode = getNextSlowerNode(slowerNode);
      fasterNode = getNextFasterNode(fasterNode);

      if(firstRun)
        firstRun = false;
    }

    // Reset the slowernode and move fasternode by one as we are now at the collision point
    // The target node is at the next collision when we move both pointer nodes by one
    slowerNode = list.head;
    while(slowerNode != fasterNode){
      slowerNode = slowerNode.next;
      fasterNode = fasterNode.next;
    }

    return slowerNode;
  }

  private static SinglyNode<Integer> getNextSlowerNode(SinglyNode<Integer> node){
    return node.next;
  }

  private static SinglyNode<Integer> getNextFasterNode(SinglyNode<Integer> node){
    try {
      return node.next.next;
    } catch(Exception e){
      return null;
    }
  }
}
