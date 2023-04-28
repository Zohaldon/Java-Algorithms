// An algorithm that removes duplicates from a doubly linked list
package algorithm.linkedlists;

import java.util.*;

// Run Time - O(N)
public class RemoveDups {
  public static <T> DoublyLinkedList<T> removeDuplicates(DoublyLinkedList<T> linkedList){
    if(linkedList.size() < 2)
      return linkedList;

    var seenItems = new ArrayList<>();
    for(int i = 0; i < linkedList.size(); i++){
      DoublyNode<T> item = linkedList.get(i);
      if(!seenItems.contains(item.data)){
        seenItems.add(item.data);
        continue;
      }

      linkedList.removeNodeAtIndex(i);
      i--;
    }
    return linkedList;
  }
}
