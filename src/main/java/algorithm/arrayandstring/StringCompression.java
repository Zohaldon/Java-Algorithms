// An Algorithm that performs basic string compression using counts of characters that are repeated.
// Case Sensitive - only accepts uppercase and lowercase letter (a-z / A-Z).
// If compressed string format is lengthier than an input string then it will return the input string back.
package algorithm.arrayandstring;

public class StringCompression{
  public String compress(String input){
    if(input.length() < 3)
      return input;

    StringBuilder compressedString = new StringBuilder();
    int numOfCharOccurrence = 1;

    for(int i = 0; i < input.length(); i++){
      char currentChar = input.charAt(i);

      // Handle last character to avoid outOfIndex Error
      if(i == input.length() - 1)
      {
        char prevChar = input.charAt(i - 1);

        if(currentChar == prevChar){
          compressedString.append(currentChar);
          compressedString.append(numOfCharOccurrence);
        } else {
          compressedString.append(currentChar);
        }
        break;
      }

      char nextChar = input.charAt(i + 1);

      if(currentChar == nextChar){
        numOfCharOccurrence++;
        continue;
      }

      if(numOfCharOccurrence > 1){
        compressedString.append(currentChar);
        compressedString.append(numOfCharOccurrence);
      } else {
        compressedString.append(currentChar);
      }

      numOfCharOccurrence = 1;
    }

    return compressedString.toString().length() >= input.length() ? input : compressedString.toString();
  }
}
