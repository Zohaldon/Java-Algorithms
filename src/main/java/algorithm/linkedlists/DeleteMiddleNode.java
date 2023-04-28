// An Algorithm that deletes the middle node of a singly linked list
package algorithm.linkedlists;

public class DeleteMiddleNode<T> extends SinglyLinkedList<T> {
  public void deleteMiddleNode(SinglyLinkedList<T> linkedList, SinglyNode<T> nodeToDelete){
    if(linkedList.head != nodeToDelete && linkedList.tail != nodeToDelete && linkedList.size() > 2){
      SinglyNode<T> current = head.next;
      for(int i = 0; i < linkedList.size() - 1; i++){
        if(nodeToDelete.data == current.data){
          break;
        }
        current = current.next;
      }
    }
  }
}
