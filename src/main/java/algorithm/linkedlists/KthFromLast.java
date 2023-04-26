// An Algorithm that returns Kth element from last for a singly linked list
package algorithm.linkedlists;

public class KthFromLast {

  // RunTime - O(N)
  public static SinglyLinkedList.Node getKthFromLast(SinglyLinkedList linkedList, int k){
    SinglyLinkedList.Node current = linkedList.head;

    if(k >= linkedList.size() || k < 0)
      throw new ArrayIndexOutOfBoundsException();

    int indexToReturn = (linkedList.size() - 1) - k;
    for(int i = 0; i < indexToReturn; i++){
      current = current.next;
    }

    return current;
  }
}
