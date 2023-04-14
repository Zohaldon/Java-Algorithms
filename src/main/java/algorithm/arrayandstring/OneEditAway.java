// An algorithm that given two strings determines if the second string is one or less edit away; where
// Edit is inserting, replacing or removing a character from the input string.
package algorithm.arrayandstring;

public class OneEditAway {
  public boolean isOneAway(String targetString, String operandString){
    // ********** Insert ************
    // pale  --> ple         | true
    // parth --> path        | true
    // top   --> po          | false
    // top   --> op          | true
    // topper   --> opped    | false
    // b     --> ''          | true

    // ********* Delete *************
    // ale   --> pale    | true
    // opped --> topper  | false
    // ''    --> b       | true
    // path  --> parth   |

    // positive difference = missing character in operand (Insert required)
    // negative difference = extra character in operand (Delete required)
    // No difference = req num of character in operand (Replacement required)
    int difference = targetString.length() - operandString.length();

    if(difference == -1){
      return isOneDeleteAway(targetString, operandString);
    } else if (difference == 1) {
      return isOneInsertAway(targetString, operandString);
    } else if (difference == 0){
      return isOneReplaceAway(targetString, operandString);
    } else {
      return false;
    }
  }

  private boolean isOneInsertAway(String targetString, String operandString){
    return isOneEditAway(targetString, operandString);
  }

  private boolean isOneDeleteAway(String targetString, String operandString){
    return isOneEditAway(operandString, targetString);
  }

  private boolean isOneReplaceAway(String targetString, String operandString){
    int numOfReplacement = 0;
    for(int i = 0; i < targetString.length(); i++){
      if(numOfReplacement > 1)
        return false;
      if(targetString.charAt(i) != operandString.charAt(i))
        numOfReplacement++;
    }

    return true;
  }

  private boolean isOneEditAway(String targetString, String operandString){
    int numOfEditRequired = 0;
    int indexForOperandString = 0;
    for(int i = 0; i < targetString.length(); i++){
      // If we have made it to the last character then it is the one that we need to edit.
      if (indexForOperandString == targetString.length() - 1 && numOfEditRequired == 0)
        return true;

      if(targetString.charAt(i) == operandString.charAt(indexForOperandString)){
        indexForOperandString++;
      } else {
        numOfEditRequired++;

        if (numOfEditRequired > 1)
          return false;
      }
    }

    return true;
  }
}
