package algorithm.arrayandstring;

import java.util.ArrayList;

// An algorithm that determines if a string has all unique characters.
public class CheckUniqueness {
    // O(N) Time complexity, O(N) Space complexity
    public boolean isUnique(String str) {
        // if the string is empty it is unique as it has no duplication.
        if (str.length() == 0)
            return true;

        // By default, we would treat given string to be unique
        boolean result = true;
        ArrayList<Character> ledger = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            // the comparison is case-insensitive
            char c = Character.toLowerCase(str.charAt(i));

            if(ledger.contains(c)) {
                result = false;
                break;
            }

            ledger.add(c);
        }

        return result;
    };
}