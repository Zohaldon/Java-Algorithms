// An algorithm that removes duplicates from a linked list
package algorithm.linkedlists;

import java.util.*;

public class RemoveDups {
  public static <T> DoublyLinkedList removeDuplicates(DoublyLinkedList linkedList){
    if(linkedList.size() < 2)
      return linkedList;

    var seenItems = new ArrayList<>();
    for(int i = 0; i < linkedList.size(); i++){
      DoublyLinkedList.Node item = linkedList.get(i);
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
