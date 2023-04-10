// Give a string, the algorithm will check if the string's permutation is a palindrome or not.
// case and special character insensitive
package algorithm.arrayandstring;

import java.util.Hashtable;
import java.util.Set;

// Run time: O(N)
public class PalindromePermutation {
  public boolean isPalindromePermutation(String input){
    // If a given string is a palindrome permutation then all of its characters should appear in even amount, with
    // one character appearing once being a valid case
    // xxAxx
    //XyyX
    if(input.length() <= 1)
      return true;

    Hashtable<Character, Integer> ledger = new Hashtable<Character, Integer>();

    for(char c: cleanString(input).toCharArray()){
      if (ledger.containsKey(c)){
        int charCount = ledger.get(c);
        ledger.replace(c, charCount + 1);
      } else{
        ledger.put(c, 1);
      }
    }

    return isPalindrome(ledger);
  }

  private String cleanString(String input){
    return keepAlphabetsOnly(input.toLowerCase());
  }

  private String keepAlphabetsOnly(String input){
    return input.replaceAll("\\W", "");
  }

  private boolean isPalindrome(Hashtable<Character, Integer> ledger){
    // If a given string with N character is a palindrome
    // then either all N characters should occur in even multiple OR
    // N - 1 characters are even, with one character appearing once (Pivot character)
    Set<Character> keys = ledger.keySet();

    int oddCharacterCount = 0;

    for(char key: keys){
      int occurrenceCount = ledger.get(key);

      if(occurrenceCount % 2 == 0 ){
        continue;
      } else {
        oddCharacterCount += 1;
        // if we have 2 character appearing in odd number then given string cannot be a palindrome
        if(oddCharacterCount > 1){ return false; }
      }
    }

    return true;
  }
}
