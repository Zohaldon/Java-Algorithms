package algorithm.arrayandstring;

public class Main {
  public static void main(String[] args) {
    // TODO: Add unit tests for the algorithms
    testUniqueness();
    testPermutation();
    testURLified();
    testPalindromePermutation();
    testOneAway();
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

    System.out.println("O(NlogN) Runtime method");
    for(int i = 0; i < comparands.length; i++) {
      boolean test_result = new CheckPermutation().isPermutationUsingSort(comparands[i], permutataions[i]);
      System.out.println("Comparand: " + comparands[i] + " ; Permutation: " + permutataions[i] + "\t\t\t| isPermutation: " + test_result);
    }

    System.out.println("O(N) Runtime method");
    for(int i = 0; i < comparands.length; i++) {
      boolean test_result = new CheckPermutation().isPermutation(comparands[i], permutataions[i]);
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

  public static void testPalindromePermutation(){
    // input: Tact Coa
    // output: True ( taco cat, tact coa)
    String testInput = "AtCo Cta";
    boolean testOutput = new PalindromePermutation().isPalindromePermutation(testInput);
    System.out.println("Input: " + testInput + " | Output: " + testOutput );
  }

  public static void testOneAway(){
    String[][] inputs = {
      { "pale", "ple" },
      { "ale", "pale" },
      { "pales", "pale" },
      { "pale", "bale" },
      { "pale", "bake" },
      { "", "a" },
      { "top", "po" },
      { "topper", "opped" },
      { "b", "" },
      { "pap", "pab"}
    };

    System.out.format("%-8s %10s %15s", "Target", "Input", "IsOneEditAway\n");
    System.out.println("--------------------------------------------");
    for(String[] inputSet: inputs){
      String target = inputSet[0];
      String input = inputSet[1];
      boolean result = new OneEditAway().isOneAway(target, input);
      System.out.format("%-10s %8s %10s\n", target, input, result);
    }
    System.out.println("--------------------------------------------");
  }
}
