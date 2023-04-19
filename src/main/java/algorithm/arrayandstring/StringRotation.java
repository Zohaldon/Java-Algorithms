// An algorithm that given 2 strings s1 and s2, checks if s2 string is rotation of s1 string by making only 1 call to
// ~ isSubstring method
package algorithm.arrayandstring;

public class StringRotation {
  public static boolean isRotation(String s1, String s2){
    if(s1.length() != s2.length())
      return false;

    StringBuilder s2Repeated = new StringBuilder();

    // concatenate two strings together
    for(int i = 0; i < 2; i++){
      s2Repeated.append(s2);
    }

    return s2Repeated.toString().contains(s1);
  }
}
