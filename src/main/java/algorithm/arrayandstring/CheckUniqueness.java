// An algorithm that determines if characters in a given string are unique or not.
package algorithm.arrayandstring;
import java.util.ArrayList;

public class CheckUniqueness {
  // Run time O(N)
  public static boolean isUnique(String word) {
    // if the string is empty it is unique as it has no duplication.
    if (word.length() <= 1)
      return true;

    // By default, we would treat given string to be unique
    boolean isUnique = true;
    ArrayList<Character> ledger = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      // the comparison is case-insensitive
      char character = Character.toLowerCase(word.charAt(i));

      if(ledger.contains(character)) {
        isUnique = false;
        break;
      }

      ledger.add(character);
    }

    return isUnique;
  }
}
