package algorithm.linkedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    testRemoveDups();
  }

  private static <T> void testRemoveDups(){
    LinkedList<String> stringLinkedList = new LinkedList<>(Arrays.asList("aa", "cc", "aa", "cc"));
    LinkedList<Integer> intLinkedList = new LinkedList<>(Arrays.asList(1,5,3,2,6,9,4,7,9,2,3,4,6,8));

    List<T> inputs = new ArrayList<>();
    inputs.add((T) stringLinkedList);
    inputs.add((T) intLinkedList);

    for(T input: inputs){
      System.out.println("Input: " + input);
      LinkedList<T> result = RemoveDups.removeDuplicatesWithBuffer((LinkedList<T>) input);
      System.out.println("Output: " + result);
      System.out.println();
    }
  }
}
