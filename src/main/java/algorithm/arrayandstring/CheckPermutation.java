// Given two strings, the method returns true if one string is a permutation of another
package algorithm.arrayandstring;

import java.util.Hashtable;
import java.util.Arrays;

public class CheckPermutation {
  // Run time O(N)
  public static boolean isPermutation(String comparand, String permutationCheck){
    // Handle empty values
    if (comparand.length() == 0 & permutationCheck.length() == 0)
      return true;
    if (comparand.length() == 0 || permutationCheck.length() == 0)
      return false;
    // Handle insufficient data
    if (comparand.length() != permutationCheck.length())
      return false;

    // If a given string is a permutation of another string
    // then it should contain all the characters of the other string
    Hashtable<Character, Integer> checkHash = new Hashtable<>();

    // Fill HashTable using comparand's character. Map each character to number of time it has appeared
    for(char c: comparand.toCharArray()){
      if(checkHash.containsKey(c)){
        int newCharacterCount = checkHash.get(c) + 1;
        checkHash.replace(c, newCharacterCount);
      } else {
        checkHash.put(c, 1);
      }
    }

    // Reduce character from hashTable based on how many times it has appeared in comparand
    for(char c: permutationCheck.toCharArray()){
      // return false if any unique character is found in permutationCheck string that is not in comparand
      if(!checkHash.containsKey(c))
        return false;

      int characterOccurrenceCount = checkHash.get(c);
      int decreasedCount = characterOccurrenceCount - 1;
      if(decreasedCount == 0){
        checkHash.remove(c);
      }
      else {
        checkHash.replace(c, decreasedCount);
      }
    }

    // if all characters are found in other string then the resulting hash will be empty
    return checkHash.isEmpty();
  }

  // Run time O(N LogN)
  public static boolean isPermutationUsingSort(String comparand, String permutationCheck){
    // Handle empty values
    if (comparand.length() == 0 & permutationCheck.length() == 0)
      return true;
    if (comparand.length() == 0 || permutationCheck.length() == 0)
      return false;
    // Handle insufficient data
    if (comparand.length() != permutationCheck.length())
      return false;

    // If a given string is a permutation of another string
    // then the sorted string should match
    char[] comparandArray = comparand.toCharArray();
    char[] permutationCheckArray = permutationCheck.toCharArray();
    Arrays.sort(comparandArray);
    Arrays.sort(permutationCheckArray);

    String tempComparand = new String(comparandArray);
    String tempPermutationCheck = new String(permutationCheckArray);

    return tempComparand.equals(tempPermutationCheck);
  }
}
