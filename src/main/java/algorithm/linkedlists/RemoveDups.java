// An algorithm that removes duplicates from a linked list
package algorithm.linkedlists;

import java.util.*;

public class RemoveDups {
  public static <T> LinkedList<T> removeDuplicatesWithBuffer(LinkedList<T> linkedList){
    if(linkedList.size() < 2)
      return linkedList;

    // 1 -> 5 -> 2 -> 5 -> 1 -> 3
    // "aa" -> "cc" -> "cc" -> "aa"
    List<T> seenItems = new ArrayList<>();
    for(int i = 0; i < linkedList.size(); i++){
      T item = linkedList.get(i);
      if(!seenItems.contains(item)){
        seenItems.add(item);
        continue;
      }

      linkedList.remove(i);
      i--;
    }
    return linkedList;
  }
}
