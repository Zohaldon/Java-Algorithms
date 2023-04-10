// Replaces all spaces in a given string with '%20'.
// Where input string would already contain enough space to accommodate the '%20' and the character count is provided
package algorithm.arrayandstring;

public class UrLify {
  public String URLifyWhitespace(String input, Integer totalExpectedCharacterCount) {
    if(input.length() == 0)
      return "";

    StringBuilder urlifiedString = new StringBuilder();
    boolean replacer = false;
    int exitCounter = 0;

    for(char c: input.toCharArray()){
      // If we have filled the stringBuilder then all eligible whitespaces are replaced. Whatever left in the input
      // string are all whitespace characters at the end.
     if(exitCounter == totalExpectedCharacterCount)
        break;

      // As soon as a non whitespace character is found we would want to replace whitespace following it.
      // By adding replacer flag we can deal with whitespace that are found at the starting of a given string.
      if(c != ' ') {
        replacer = true;
        urlifiedString.append(c);
        exitCounter++;
      }

      // If conditions are met then replace the whitespace and turn the replacer flag off.
      // By turning off the replacer flag the method can avoid replacing consecutive whitespaces.
      if(c == ' ' && replacer)
      {
        replacer = false;
        urlifiedString.append("%20");
        exitCounter++;
      }
    }

    return urlifiedString.toString();
  }
}
