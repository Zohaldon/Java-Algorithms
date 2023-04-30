// An algorithm that given a singlyLinked list returns true if linked list is a palindrome
package algorithm.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

  // Runtime: O(N)
  public static boolean isPalindromeList(SinglyLinkedList<Character> inputList){
    if(inputList.size() < 2)
      return true;

    List<Character> characters = new ArrayList<>();
    collectCharacters(inputList, characters);

    return isPalindrome(inputList, characters);
  }

  private static void collectCharacters(SinglyLinkedList<Character> inputList, List<Character> characters){
    SinglyNode<Character> currentNode = inputList.head;
    for(int i = 0; i < inputList.size(); i++){
      characters.add(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  private static boolean isPalindrome(SinglyLinkedList<Character> inputList, List<Character> characters){
    boolean palindrome = true;
    SinglyNode<Character> currentNode = inputList.head;
    for(int i = 0; i < inputList.size(); i++){
      if(currentNode.data != characters.get(inputList.size() -  i - 1)){
        palindrome = false;
        break;
      }
      currentNode = currentNode.next;
    }

    return palindrome;
  }
}
