package algorithm.arrayandstring;

public class Main {
  public static void main(String[] args) {
    // testUniqueness();
    // testPermutation();
    testURLified();;
  }

  public static void testUniqueness() {
    String test_word = "tesT";
    boolean test_result = new CheckUniqueness().isUnique(test_word);
    System.out.println("String: " + test_word + " | isUnique: " + test_result);
  }

  public static void testPermutation(){
    // A: tester | B: ttrees    (true)
    // A: abcdef | B: dcefba    (true)
    // A: tester | B: tt        (false)
    // A: abcdef | B: dcefbavol (false)
    // A: aab    | B: aaa       (false)
    String[] comparands =    { "tester", "abcdef", "tester",  "abcdef",    "aab"};
    String[] permutataions = { "ttrees", "dcefba", "tt",      "dcefbavol", "aaa"};

    for(int i = 0; i < comparands.length; i++) {
      // boolean test_result = new CheckPermutation().isPermutation(comparands[i], permutataions[i]);
      boolean test_result = new CheckPermutation().isPermutationUsingSort(comparands[i], permutataions[i]);
      System.out.println("Comparand: " + comparands[i] + " ; Permutation: " + permutataions[i] + "\t\t\t| isPermutation: " + test_result);
    }
  }

  public static void testURLified(){
    // Sample input:   "  Mr John Smith  ", 13
    // Sample input:   "Mr John Smith    ", 13
    // Sample output": "Mr%20John%20Smith"
    String[] inputs = {
      "  Mr John Smith  ",
      "Mr John Smith    ",
      "                 ",
      "3a2s1d8q5we34&*@3"
    };

    for(String testInput: inputs){
      String testOutput = new UrLify().URLifyWhitespace(testInput, 13);
      System.out.println("Input: " + testInput + " | Output: " +  testOutput);
    }
  }
}
