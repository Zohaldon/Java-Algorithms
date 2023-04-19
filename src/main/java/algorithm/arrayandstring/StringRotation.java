// An algorithm that given 2 strings s1 and s2, checks if s2 string is rotation of s1 string by making only 1 call to
// ~ isSubstring method
package algorithm.arrayandstring;

public class StringRotation {
  public static boolean isRotation(String s1, String s2){
    if(s1.length() != s2.length())
      return false;

    return s2.repeat(2).contains(s1);
  }
}
